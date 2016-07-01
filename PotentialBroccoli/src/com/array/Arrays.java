package com.array;

public class Arrays {
	
	public void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
    }
	
	public static boolean findMatrix(int[][] matrix, int val){
		for(int i=0;i<matrix.length;i++){
			if(binarysearch(matrix[i], val))
				return true;
		}
		return false;
	}
	
	public static boolean binarysearch(int array[], int val){
		
		int lo = 0;
		int hi = array.length - 1;
		
		while(lo <= hi){
			int mid = (lo + hi) / 2;
			if(array[mid] == val){
				return true;
			}
			if(val<array[mid]){
				hi = mid-1;
			} else {
				lo = mid + 1;
			}
		}
		return false;
	}
	
	public void moveZeroes2(int[] nums) {
        if(nums == null){
            return;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            	nums[count++] = nums[i];
            }
        }
        
        while(count<nums.length){
        	nums[count++] = 0;
        }
    }
	
	public static void main(String args[]){
		Arrays m = new Arrays();
		int array[] = {2, 3, 4, 5, 6, 7};
		
		int matrix[][] = {{0,1,2,3},{10,13,55,78},{1,4,7,9},{9,10,11,12}};
		if(findMatrix(matrix, 78)){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
