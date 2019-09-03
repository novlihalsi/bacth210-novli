package com.xsis.day04;

public class Logic02 {
    public static void main(String[] args) {
        int [] nums = new int[7];
        Logic02 logic = new Logic02();

        logic.soal1(nums);
        System.out.println();
        logic.soal2(nums);
        System.out.println();
        logic.soal3(nums);
    }

    public void soal1(int[] nums) {
        int n2 = 3;
        for (int i=0; i<nums.length; i++) {
            nums [i] = i;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i=0; i<nums.length; i++) {
            nums [i] = (int) Math.pow(n2, nums[i]);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int Perhitungan = nums [0] + nums [1] + nums [2];

        System.out.print("Perhitungan ==> " + nums[0] +" + "+ nums[1] +" + "+ nums[2] +" = "+ Perhitungan );
    }

    public void soal2(int[] nums){
        int n2 = 3;
        for (int i=0; i<nums.length; i++ ) {
            nums[i]=i;
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i=0; i<nums.length; i++) {
            nums[i] = (int) Math.pow(n2, i);
            if ((i+1) % 3 == 0) {
                nums [i] = -nums[i];
            }
            System.out.print(nums[i] + " ");

        }
        System.out.println();

        int Penjumlahan = nums[0] * nums[1] * nums[2];

        System.out.print("Perhitungan ==> " + nums[0] +  " + " + nums[1] + " + " + nums[2] +  " = " + Penjumlahan);

    }

    public void soal3 (int[] nums) {
        int hasil = 2;
        for (int i=0; i<nums.length; i++) {
            nums [i] = i;
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        for (int i=0; i<nums.length; i++ ) {


            if (i==1){
                hasil *=3;
            } else if (i>1 && i<4) {
                hasil *=2;
            } else if (i>3 && i<6) {
                hasil /=2;
            } else if (i==6) {
                hasil /= 3;
            }
            nums[i] = hasil;
            System.out.print(nums[i] + " ");

        }
        System.out.println();
        int Perhitungan = nums[3] - nums[2] - nums[1];

        System.out.println("Perhitungan ==> " + nums[3] + " - " + nums[2] + " - " + nums[1] + " = " + Perhitungan );

    }

}
