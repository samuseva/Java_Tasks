package com.company;

import java.util.Random;

public class Task5 {

    String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    StringBuilder randomString(int i){
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        for (; i-- > 0; sb.append(alphanumeric.charAt(random.nextInt(62))));
        return sb;
    }
    /*
    StringBuilder reverseString(StringBuilder stringBuilder) {
        char[] x = stringBuilder.toString().toCharArray();
        
        char[] x= "Hello world".toCharArray();
        int l=x.length, i=l/2;
        l--;
        while(i-->0){
            x[i]^=x[l-i];
            x[l-i]^=x[i];
            x[i]^=x[l-i];
        }
        System.out.print(x);
        return new StringBuilder(String.valueOf(x));
    }
Числа Фибоначчи: for(int n1=1, n2=1; n1<1000; System.out.println((n1+=n2) +" "+ (n2+=n1)))
Простое ли число х?: for(int n=x/2; (x%n)!=0; n--)
Факториал: for(int n=1, s=1; (++n)<10 ;System.out.println(s*=n))
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
