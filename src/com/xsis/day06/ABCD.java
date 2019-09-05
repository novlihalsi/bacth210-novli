package com.xsis.day06;

class A {
    String a = null;
    void doA() {
        System.out.println("A says : " + a);
    }
}

class B extends A {
    String b = null;

    @Override
    void doA() {
        super.doA();
    }

    void doB() {
        System.out.println("B says : " +b);
    }
}

class C extends B {
    String c = null;
    void doA() {
        System.out.println("Who care what A says");
    }
    void doB() {
        System.out.println("Who care what B says");
    }
    void doC() {
        System.out.println("C says " + a + " " + b + " " + c);
    }
}

public class ABCD {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a = "AAA";
        b.a = "B's A";
        b.b = "BBB";
        c.a = "Who Cares";
        c.b = "Whatever";
        c.c = "CCC";

        a.doA();
        b.doA();
        b.doB();
        c.doA();
        c.doB();
        c.doC();
    }
}
