package com.xsis.day07.abstrack;

public class EmployeeAbstractDemo {
    public static void main(String[] args) {
        Staff s1 = new Staff("Ahmad", "1111", "ahmadnovli@gmail.com", 1994, 30000);
        System.out.println(s1.getTotalGaji());

    }
}
