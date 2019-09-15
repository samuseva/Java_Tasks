package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task11 {
    String str[] = {"abc", "cba", "Bca", "bca", "Abc", "ABc", "acb", "bca", "abc"};

    ArrayList<String> list = new ArrayList<String>();
    HashSet<String> hash = new HashSet<String>();
    TreeSet<String> tree = new TreeSet<String >();
    void start() {
        for (String s : str) {
            list.add(s);
            hash.add(s);
            tree.add(s);
        }
        Iterator iList = list.iterator();
        Iterator iHash = hash.iterator();
        Iterator iTree = tree.iterator();

        System.out.println("List of ArrayList");
        while(iList.hasNext()){
            System.out.println(iList.next());
        }
        System.out.println("List of HashSet");
        while(iHash.hasNext()){
            System.out.println(iHash.next());
        }
        System.out.println("List of TreeSet");
        while(iTree.hasNext()){
            System.out.println(iTree.next());
        }
    }
}
