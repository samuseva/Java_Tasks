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
        Iterator itList = list.iterator();
        Iterator itHash = hash.iterator();
        Iterator itTree = tree.iterator();

        System.out.println("List of ArrayList");
        while(itList.hasNext()){
            System.out.println(itList.next());
        }
        System.out.println("List of HashSet");
        while(itHash.hasNext()){
            System.out.println(itHash.next());
        }
        System.out.println("List of TreeSet");
        while(itTree.hasNext()){
            System.out.println(itTree.next());
        }
    }
}
