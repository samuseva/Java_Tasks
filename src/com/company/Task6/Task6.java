package com.company.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {

    public void start(){
        List<Cat> cat= new ArrayList<Cat>();
        cat.add(new Cat(30,"First"));
        cat.add(new Cat(20,"Second"));
        cat.add(new Cat(10,"Third"));
        cat.add(new Cat(20,"Fourth"));
        cat.add(new Cat(50,"Fifth"));

        Collections.sort(cat);
        System.out.println("Ascending");
        for (Cat c: cat){
            System.out.println(c.age+"  "+c.name);
        }

        System.out.println("Descending");
        Collections.sort(cat,new CatComparator());
        for (Cat c: cat){
            System.out.println(c.age+"  "+c.name);
        }
    }
}
