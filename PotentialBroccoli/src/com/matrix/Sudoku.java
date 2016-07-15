package com.matrix;

import java.util.Scanner;

public class Sudoku {
	
	Integer matrix[][];
	private int matrixSize;
	
	public Sudoku(int matrixSize) throws Exception {
		this.matrixSize = matrixSize;
		if(matrixSize%3 != 0){
			throw new Exception("Enter matrix size in multiples of three");
		} else {
			matrix = new Integer[matrixSize][matrixSize];
		}
	}
	
	public boolean solveSudoku(){
		
		Coordinate coordinate = findUnassignedLocation();
		if(coordinate == null){
			printMatrix();
			return true;
		}
		
		for(int i=1;i<=9;i++){
			int row = coordinate.getRow();
			int col = coordinate.getCol();
			
			if(isSafe(row,col,i)){
				
				matrix[row][col] = i;
				if(solveSudoku()){
					return true;
				}
				
				matrix[row][col] = null;
			}
		}
//		printMatrix();
		return false;
	}
	
	public void printMatrix(){
		for(int row=0;row<matrixSize;row++){
			for(int col=0;col<matrixSize;col++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public Coordinate findUnassignedLocation(){
		Coordinate coordinate = null;
		for(int row=0;row<matrixSize;row++){
			for(int col=0;col<matrixSize;col++){
				if(matrix[row][col] == null){
					coordinate = new Coordinate(row, col);
					return coordinate;
				}
			}
		}
		
		return coordinate;
	}
	
	public boolean isSafeInRow(int row, int num){
		for(int col=0;col<matrixSize;col++){
			if(matrix[row][col]!=null && matrix[row][col] == num){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isSafeInCol(int col, int num){
		for(int row=0;row<matrixSize;row++){
			if(matrix[row][col]!=null && matrix[row][col] == num){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isSafeInGrid(int boxStartRowIndex,int boxStartColIndex, int num){
		
		for(int row=0;row<3;row++){
			for(int col=0;col<3;col++){
				if(matrix[row+boxStartRowIndex][col+boxStartColIndex]!=null && matrix[row+boxStartRowIndex][col+boxStartColIndex] == num){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean isSafe(int row, int col, int num){
		int boxStartRowIndex = row - row%3;
		int boxStartColIndex = col - col%3;
		if(isSafeInRow(row, num) &&
				isSafeInCol(col, num) &&
					isSafeInGrid(boxStartRowIndex, boxStartColIndex, num))
			return true;
		
		return false;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrixSize");
		int matrixSize = sc.nextInt();
		try {
			Sudoku s = new Sudoku(matrixSize);
			System.out.println("Solve sudoku success ? " + s.solveSudoku());
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static class Coordinate{
		private int row;
		private int col;
		
		public Coordinate(int row,int col){
			this.row = row;
			this.col = col;
		}
		
		public int getRow(){
			return row;
		}
		
		public int getCol(){
			return col;
		}
	}

}
