package com.company;

import java.util.*;

public class Task10 {

    String str[] = {"abc", "cba", "Bca", "bca", "Abc", "ABc", "acb", "bca", "abc"};

    ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
    HashSet<String> hash = new HashSet<>(Arrays.asList(str));
    TreeSet<String> tree = new TreeSet<>(Arrays.asList(str));

    Task10() {

        System.out.println("List of ArrayList");
        System.out.println(list);

        System.out.println("List of HashSet");
        System.out.println(hash);

        System.out.println("List of TreeSet");
        System.out.println(tree);


    }
}
