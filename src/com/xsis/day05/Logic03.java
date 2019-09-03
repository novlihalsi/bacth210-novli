package com.xsis.day05;

public class Logic03 {
    public static void main(String[] args) {
        int[][] num = new int[7][7];

        Logic03 logic = new Logic03();

        logic.Soal1(num);

    }


    public void Soal1(int[][] num) {
        int x = 2;
        int y = 53;
        for (int row=0; row<num.length; row++){
            for (int colomn=0; colomn<num[row].length; colomn++) {
                if (row==0) {
                    if(row<1&&colomn==3) {
                        System.out.print("3 ");
                    } else {
                        System.out.print(x +" ");
                        x+=3;
                    }
                }else if(colomn==0){
                    if(row==1&&colomn==0||row==5&&colomn==0){
                        System.out.print("3 ");
                    } else {
                        System.out.print(y + " ");
                        y-=3;
                    }
                } else if (row==6) {
                    if(row==6&&colomn==3){
                        System.out.print("3 ");
                    } else {
                        System.out.print(y +" ");
                        y-=3;
                    }

                }else if(colomn==6) {
                    if(row==1&&colomn==6||row==5&&colomn==6){
                        System.out.print("3" );
                    } else {
                        System.out.print(x + " ");
                        x+=3;
                    }
                }  else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void Soal2 (int[][] num) {
        int x = 20;
        int y = 41;
        int z = 17;
        for(int row=6; row>-1; row--){
            for (int colomn=0; colomn<num[row].length; colomn++){
                if(row==colomn){
                    if(row==3&&colomn==3){
                        System.out.print("3 ");
                    }else {
                        System.out.print(z+" ");
                        z-=3;
                    }
                } else if(colomn==6){
                    if (row==5&&colomn==6){
                        System.out.print("9 ");
                    }else {
                        System.out.print(x+" ");
                        x+=3;
                    }
                } else if (row==0){
                    if (row==0&&colomn==3){
                        System.out.print("81 ");
                    }else {
                        System.out.print(y+" ");
                        y-=3;
                    }
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
