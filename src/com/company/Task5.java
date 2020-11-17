package com.company;

import java.util.Random;

public class Task5 {

    String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    StringBuilder randomString(int i){
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        while (i-- > 0)
            sb.append(alphanumeric.charAt(random.nextInt(62))));
        return sb;
    }
    /*
    StringBuilder reverseString(StringBuilder stringBuilder) {
        char[] a = stringBuilder.toString().toCharArray();
        
        char[] a = "Hello world".toCharArray();
        int len = a.length-1;
        for (int i = (len+1)/2; i > 0; i--){
            a[i] ^= a[len-i];
            a[len-i] ^= a[i];
            a[i] ^= a[len-i];
        }
        System.out.print(a);
        return new StringBuilder(String.valueOf(a));
    }
Числа Фибоначчи: for (int n1 = 1, n2 = 1; n1 < 1000; System.out.println((n1+=n2) +" "+ (n2+=n1)))
Простое ли число х?: for (int n = x/2; (x%n) != 0; n--)
Факториал: for (int n = 1, s = 1; ++n < 10; System.out.println( s*=n ))
    */
    StringBuilder reverseString(StringBuilder s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i-- > 0; sb.append(s.charAt(i)));
        return sb;
    }

    Task5(){
        for (int i = 10; i > 0; i--) {
            StringBuilder s1 = randomString(i);
            StringBuilder s2 = reverseString(s1);
            //StringBuilder s2 = new StringBuilder().append(s1);
            //reverseString(s2);
            System.out.println(s1+" : "+s2);
            switch (i){
                case 1 :
                case 2 :
                case 3 :
                    System.out.println("Index - "+i);
                    break;
                case 4 :
                    System.out.println("Index - Four");
                    break;
                case 5:
                    System.out.println("Index - Five");
                    break;
                default:
                    System.out.println("Index more than Five");
            }
        }
    }
}
