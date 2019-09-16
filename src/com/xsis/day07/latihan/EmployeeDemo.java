package com.xsis.day07.latihan;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeDemo demo = new EmployeeDemo();
        Employee e1 = new Employee("Ahmad Noveliansyah", "1111", "ahmadnovli@gmail.com", 1994, 5000000);
        Employee e2 = new Employee("Fadhlan Halsi", "1112", "fadhlan@gmail.com", 1993, 6000000);
        Employee e3 = new Employee("M. Yasin", "1113", "jobox@gmail.com", 1991, 4500000);
        Employee e4 = new Employee("Ardi", "1114", "ardi@gmail.com", 1995, 5500000);
        Employee e5 = new Employee("Kahfi", "1114", "kahfi@gmail.com", 2008, 9000000);


        Employee[] listEmployee = new Employee[5];
        listEmployee[0] = e1;
        listEmployee[1] = e2;
        listEmployee[2] = e3;
        listEmployee[3] = e4;
        listEmployee[4] = e5;

        demo.findAll(listEmployee);
//        demo.findbySSN(listEmployee, "1113");
//        demo.sortSalary(listEmployee);


    }

    void findAll(Employee[] listEmployee) {

        for (int i = 0; i < listEmployee.length; i++) {
            System.out.println(listEmployee[i].getName() + " " + listEmployee[i].getSsn() + " " + listEmployee[i].getEmailAddress() + " " + listEmployee[i].getYearOFBirth() + " " + listEmployee[i].getSalary());
        }

    }

    void findbySSN(Employee[] listEmployee, String ssn) {
        for (int i=0; i<listEmployee.length; i++) {
            if(listEmployee[i].getSsn()==ssn) {
                System.out.println(listEmployee[i].getName() + " " + listEmployee[i].getSsn() + " " + listEmployee[i].getEmailAddress() + " " + listEmployee[i].getYearOFBirth() + " " + listEmployee[i].getSalary());
            }
        }
    }

    void sortSalary(Employee[] listEmployee) {
        double max = listEmployee[0].getSalary();
        for(int i = 0; i<listEmployee.length; i++ ) {
            if (max<listEmployee[i].getSalary()) {
                max=listEmployee[i].getSalary();
            }
        }
//        System.out.println(max);

        for (int j = 0; j<listEmployee.length; j++){
            if (listEmployee[j].getSalary()==max) {
                System.out.println(listEmployee[j].getName() + " " + listEmployee[j].getSsn() + " " + listEmployee[j].getEmailAddress() + " " + listEmployee[j].getYearOFBirth() + " " + listEmployee[j].getSalary());
            }
        }


    }


}
