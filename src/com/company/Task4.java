package com.company;

import java.util.Random;

public class Task4 {
    void start() {
        
        int a1, a1n, a2, a2n, i=10;
        Random random = new Random();
        int arr1[] = new int[i];
        int arr2[] = new int[i];
        
        while((i-=2)>=0) {              //Loop with decrement -2            
            a1 = arr1[i] = random.nextInt(9);
            a1n = arr1[i+1] = random.nextInt(9);
            a2 = arr2[i] = random.nextInt(9);
            a2n = arr2[i+1] = random.nextInt(9);
            System.out.println(a1==a2 ? a1+" = "+a2 : a1+" <> "+a2);
            System.out.printf("%d %s %d\n", a1n, a1n==a2n ? "=" : "<>", a2n);
        }
    }
}
