package com.xsis.day06;

public class Car {
    String lisencePlate;
    int speed;
    int gear;


    void start () {
        System.out.println("Engine Start...");
        lisencePlate = "B 4440 TS";
        speed = 0;
        gear = 0;
    }

    void goFaster (int gear) {
        System.out.println("Go Faster...");
        this.gear = gear;
        if (gear == 1) {
            speed += 30;
        } else if (gear == 2) {
            speed += 60;
        } else if (gear==3) {
            speed +=90;
        }else if (gear==4) {
            speed +=120;
        } else {
            speed = 0;
        }

    }

    void print() {
        System.out.println("No Plat : " +lisencePlate);
        System.out.println("Speed : " +speed + " Km/h");
        System.out.println("Gear : " +gear);
        System.out.println();
    }
}
