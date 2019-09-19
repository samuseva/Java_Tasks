package com.company;

import java.util.*;

public class Task10 {
    void start() {
        String str[] = {"abc", "cba", "Bca", "bca", "Abc", "ABc", "acb", "bca", "abc"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        HashSet<String> hash = new HashSet<String>(Arrays.asList(str));
        TreeSet<String> tree = new TreeSet<String >(Arrays.asList(str));
        /*String strList[] = list.toArray(str);
        String strHash[] = hash.toArray(str);
        String strTree[] = tree.toArray(str);

        System.out.println("List of ArrayList");
        for(String s : strList){
            System.out.println(s);
        }
        System.out.println("List of HashSet");
        for(String s : strHash){
            System.out.println(s);
        }
        System.out.println("List of TreeSet");
        for(String s : strTree){
            System.out.println(s);
        }*/
        System.out.println("List of ArrayList");
        System.out.println(list);
        System.out.println("List of HashSet");
        System.out.println(hash);
        System.out.println("List of TreeSet");
        System.out.println(tree);


    }
}
