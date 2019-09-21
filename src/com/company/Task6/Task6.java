package com.company.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {

    public void start(){
        List<Cat> cat= new ArrayList<>(
                List.of(
                new Cat(30,"First"),
                new Cat(20,"Second"),
                new Cat(10,"Third"),
                new Cat(20,"Fourth"),
                new Cat(50,"Fifth")
                )
        );

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
