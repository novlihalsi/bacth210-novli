package com.xsis.day02;

public class MultidimensiArray {
    public static void main(String[] args) {
        int [][] nums = {{1,5,4,3}, {9,3,5,6}, {4,5,6,12}};

        MultidimensiArray array2d = new MultidimensiArray();
        array2d.searchNums(nums,5);

    }

    public void searchNums(int[][] nums, int search){

        for (int row = 0; row<nums.length; row++){
            for (int column = 0; column < nums[row].length; column++){
                if (nums[row][column]==search)
                    System.out.println("found : "+search+ " at position : " + "Baris : " + row + " " + "Kolom " +column);
            }



        }



    }
}

