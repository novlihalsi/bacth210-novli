package com.afterft1.day02.soal02;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account(123, 500000);
        Account acc2 = new Account(124, 100000);
        Account acc3 = new Account(125, 200000);
        Account acc4 = new Account(126, 300000);
        Account acc5 = new Account(126, 400000);

        Account[] listAccount = {acc, acc2, acc3, acc4, acc5};
        Scanner sc = new Scanner(System.in);

        boolean done = true;
        while (done) {
            System.out.print("Enter Commend (1=Debet, 2=Transfer, 0=Exit) : ");
            int command = sc.nextInt();
            if (command == 1){
                prosesDebet(acc, sc);
            } else if (command == 0){
                done = false;
            } else if (command == 2 ){
                getListNorek(listAccount);
                System.out.print("Input Rekening Tujuan : " );
                int nomor = sc.nextInt();
                getAccount(listAccount, nomor);
                prosesTransfer(acc, getAccount(listAccount, nomor), sc);
            }
        }

    }

    static void prosesDebet(Account account, Scanner scanner){
        System.out.print("Penarikan uang tunai : " );
        double tarik = scanner.nextDouble();
        System.out.println("Current Saldo : "  + account.getSaldo());
        System.out.println("Tarik Tunai : " + tarik);
        account.setSaldo(account.getSaldo()-tarik);
        System.out.println("Sisa Saldo : " + account.getSaldo());

    }

    static void prosesTransfer(Account account, Account account2, Scanner scanner){
        System.out.print("Transfer uang tunai : ");
        double transfer = scanner.nextDouble();
        System.out.println("Current Saldo : " + account.getSaldo());
        System.out.println("Transfer : " + transfer);
        account.setSaldo(account.getSaldo()-transfer);
        System.out.println("Sisa Saldo : " + account.getSaldo());
        System.out.println("Sisa Saldo Account Penerima : " + account2.getSaldo());
        account2.setSaldo(account2.getSaldo()+transfer);
        System.out.println("Sisa Saldo Setelah di Transfer : " + account2.getSaldo());
    }

    static void getListNorek(Account[] listaccount){
        for (int i=0; i<listaccount.length; i++){
            System.out.println(listaccount[i].getNorek());
        }
    }

    static Account getAccount(Account[] listaccount, int noRek){
        Account account = null;
        for (int i = 0; i < listaccount.length ; i++) {
            if (noRek == listaccount[i].getNorek()){
                account = listaccount[i];
            }
        }
        return account;
    }
}
