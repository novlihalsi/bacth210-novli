package com.xsis.day03;

public class ArrayBox {
    public static void main(String[] args) {
        int [][] nums = new int [7][7];




        ArrayBox arr = new ArrayBox();

//        arr.setBox(nums);
//        arr.setDiagonalLeft(nums);
//        arr.setDiagonalRight(nums);
//        arr.setHorizontalTop(nums);
//        arr.setHorizontalBottom(nums);
        arr.setAll(nums);


    }



    void setHorizontalBottom(int[][] nums) {
        for (int row=0; row<nums.length; row++){
            for (int colomn=0; colomn<nums[row].length; colomn++) {
                if (row==6){
                    System.out.printf("%d ", nums[row][colomn]=9);
                }else {
                    System.out.printf("%s ", " ");
                }
            }
            System.out.println();
        }
    }

    void setAll(int[][] nums) {
        for (int row=0; row<nums.length; row++){
            for (int colomn=0; colomn<nums[row].length; colomn++) {
                if(row==6||colomn==0||colomn==6||row==0){
                    System.out.printf("%d ", nums[row][colomn]=9);
                }else {
                    System.out.printf("%s ", " ");
                }
            }
            System.out.println();
        }
    }

    void setHorizontalTop(int[][] nums) {
        for (int row=0; row<nums.length; row++) {
            for (int colomn=0; colomn<nums[row].length; colomn++){
                if(row==0){

                    System.out.printf("%d ", nums[row][colomn]=9);

                }else {
                    System.out.printf("%s ", "*");
                }
            }
            System.out.println();
        }
    }

    void setDiagonalRight(int[][] nums){
        for (int row=0; row<nums.length; row++){
            for (int colomn=0; colomn<nums[row].length; colomn++){
                if(row + colomn == 4) {
                    System.out.printf("%d ", nums[row][colomn]=9);
                } else {
                    System.out.printf("%s ", "*");
                }
            }
            System.out.println();
        }
    }

    void setDiagonalLeft(int[][] nums) {
        for (int row=0; row<nums.length; row++) {
            for (int colomn=0; colomn<nums[row].length; colomn++) {
                if (row == colomn) {
                    System.out.printf("%d ", nums[row][colomn] = 9);
                } else {
                    System.out.printf("%s ", "*");
                }
            }
            System.out.println();
        }
    }

    void setBox(int[][] nums) {
        for (int row=0; row<nums.length; row++){
            for (int colomn=0; colomn<nums[row].length; colomn++){
                System.out.printf("%d ", nums[row][colomn] = 9);
            }
            System.out.println();
        }
    }

}
