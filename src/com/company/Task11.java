package com.company;

import java.util.*;

class Task11 {

    String str[] = {"abc", "cba", "Bca", "bca", "Abc", "ABc", "acb", "bca", "abc"};

    ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
    HashSet<String>   hash = new HashSet<>(Arrays.asList(str));
    TreeSet<String>   tree = new TreeSet<>(Arrays.asList(str));

    Task11() {

        System.out.println("List of ArrayList");
        print(list.iterator());

        System.out.println("List of HashSet");
        print(hash.iterator());

        System.out.println("List of TreeSet");
        print(tree.iterator());
    }

    void print(Iterator it){
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
