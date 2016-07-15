package com.matrix;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

public class Maze {

	public Maze() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<Point> getPath(boolean [][] maze){
		if(maze==null || maze.length == 0){
			return null;
		}
		ArrayList<Point> path = new ArrayList<>();
		HashSet<Point> failedPoints = new HashSet<>();
 		if(getPath(maze,0,0,path, failedPoints)){
			return path;
		}
		
		return null;
	}

	private boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
		// TODO Auto-generated method stub
		if(col>maze[0].length-1||row>maze.length-1||!maze[row][col]){
			return false;
		}
		
		Point p = new Point(row,col);
		
		if(failedPoints.contains(p)){
			return false;
		}
		
		boolean isAtDst = (row==maze.length-1) && (col==maze[0].length-1);
		
		boolean path1 = getPath(maze,row+1,col,path,failedPoints);
		boolean path2 = getPath(maze,row,col+1,path,failedPoints);
		
		if(isAtDst || path1 || path2){
			path.add(new Point(row,col));
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		boolean maze[][] = {{true,false,true,true},
							{true,false,false,true},
							{true,true,true,true}};
		Maze m = new Maze();
		ArrayList<Point> list = m.getPath(maze);
		for(Point p: list){
			System.out.println((int)p.getX() + "" + (int)p.getY());
		}
	}

}
