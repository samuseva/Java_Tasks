package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {
    
    void func(int i) {
        i = 20;
        System.out.println("int = " + i);
    }
    
    void func(AtomicInteger i) {
        i.set(2000);
        System.out.println("AtomicInteger = " + i);
    }
    
    void start() {
        int intVar = 10;
        AtomicInteger atomicVar = new AtomicInteger(1000);

        System.out.println("Before Function");
        System.out.println("int = " + intVar);
        System.out.println("AtomicInteger = " + atomicVar);

        System.out.println("In Function");
        func(intVar);
        func(atomicVar);

        System.out.println("After Function");
        System.out.println("int = " + intVar);
        System.out.println("AtomicInteger = " + atomicVar);
    }
}
