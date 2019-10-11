package com.company;

import java.util.Random;

public class Task5 {

    String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    StringBuilder randomString(int i){
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        while (i-->0){
            sb.append(alphanumeric.charAt(random.nextInt(62)));
        }
        return sb;
    }
    /*
    void reverse_Array() {
        int x[]={2,3,4,5};
        int len = x.length;
        int i=len>>1; len--;
        while(i-->0){
            x[i]^=x[len-i];
            x[len-i]^=x[i];
            x[i]^=x[len-i];
        }
        System.out.println(Arrays.toString(x));
    }
    */
    StringBuilder reverseString(StringBuilder s) {
        int i = s.length();
        StringBuilder sb = new StringBuilder(i);
        while(i-->0)
            sb.append(s.charAt(i));
        return sb;
    }

    Task5(){
        int i=10;
        while (--i>0) {
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
