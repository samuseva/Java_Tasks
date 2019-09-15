package com.company;

import java.util.Random;

public class Task5 {

    StringBuilder stringBuilder(int i){

        StringBuilder sb = new StringBuilder(i);
        Random ran = new Random();

        while (--i >= 0){
            sb.append((char)(ran.nextInt(94)+32));
        }

        return sb;
    }

    StringBuilder reverseString(StringBuilder sb) {

        int len = sb.length()-1;
        for (int i = 0; i<=len/2; i++){
            char tmp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(len-i));
            sb.setCharAt(len-i,tmp);
        }
        return sb;
    }

    void start(){
        for (int i = 1; i<10; i++){
            StringBuilder sb1 = stringBuilder(i);
            StringBuilder sb2 = reverseString(new StringBuilder().append(sb1));
            System.out.println(sb1+" : "+sb2);
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
