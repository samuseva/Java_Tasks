package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {
    void func(AtomicInteger i) {
        i.set(2000);
        System.out.println("AtomicInteger = " + i);
    }

    void func(int i) {
        i = 20;
        System.out.println("int = " + i);
    }

    void start() {
        int iVar = 10;
        AtomicInteger atomicVar = new AtomicInteger(1000);

        System.out.println("Before Function");
        System.out.println("int = " + iVar);
        System.out.println("AtomicInteger = " + atomicVar);

        System.out.println("In Function");
        func(iVar);
        func(atomicVar);

        System.out.println("After Function");
        System.out.println("int = " + iVar);
        System.out.println("AtomicInteger = " + atomicVar);
    }
}
