package com.company;

import java.util.Random;

public class Task4 {
    void start() {
        Random random = new Random();
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int i=0;
        do {
            int a1 = arr1[i] = random.nextInt(9);
            int a1n = arr1[i+1] = random.nextInt(9);
            int a2 = arr2[i] = random.nextInt(9);
            int a2n = arr2[i+1] = random.nextInt(9);
            System.out.println(a1==a2 ? a1+" = "+a2 : a1+" <> "+a2);
            System.out.printf("%d %s % d\n", a1n, a1n==a2n ? "=" : "<>", a2n);
        } while((i+=2)<10);

    }
}
;
