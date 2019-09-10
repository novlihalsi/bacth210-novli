package com.xsis.day04;

public class Logic02 {
    public static void main(String[] args) {
        int [] nums = new int[7];
        Logic02 logic = new Logic02();

        logic.soal01(nums);
        logic.soal02(nums);
        logic.soal03(nums);
        logic.soal05("Aku Sayang Kamu ");
        logic.soal06("Aku Sayang Kamu Tapi Kamu");
    }

    public void soal01(int[] nums) {
        System.out.println("Soal 01");
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

        System.out.println("Perhitungan ==> " + nums[0] +" + "+ nums[1] +" + "+ nums[2] +" = "+ Perhitungan );
        System.out.println();
    }

    public void soal02(int[] nums){
        System.out.println("Soal 02");
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

        System.out.println("Perhitungan ==> " + nums[0] +  " + " + nums[1] + " + " + nums[2] +  " = " + Penjumlahan);
        System.out.println();

    }

    public void soal03 (int[] nums) {
        System.out.println("Soal 03");
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
        System.out.println();

    }

     void soal05(String kalimat){
         System.out.println("Soal 05");
        int start = 0;
        int end = 0;
        String finalKata="";

        for (int i=0; i<kalimat.length() ; i++){
            char huruf = kalimat.charAt(i);

            end = i;

            if(huruf == ' '){
                String cutWord = kalimat.substring(start,end);
                int lengthWord = kalimat.substring(start,end).length();

                String kata ="";
                for (int j=0; j<lengthWord; j++) {
                    char chin= cutWord.charAt(j);
                    if ((j==0) || (j==lengthWord-1)){
                        kata=kata +chin;
                    }
                    if((j>0)&&(j<lengthWord-1)){
                        kata = kata+"*";
                    }

                }
                start=end+1;
                finalKata = finalKata+" "+kata;
            }
        }
        System.out.println(finalKata);
         System.out.println();
    }

    void soal06(String kalimat){
        System.out.println("Soal 06");
        int hitung=0;
        for (int i=0; i<kalimat.length(); i++){
            char huruf=kalimat.charAt(i);
            if (Character.isUpperCase(huruf)){
                hitung++;
            }

        }
        System.out.println(hitung);
    }


}
