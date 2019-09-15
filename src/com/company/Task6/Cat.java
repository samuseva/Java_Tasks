package com.company.Task6;

public class Cat extends AbstractAnimal implements Comparable<Cat> {

    int age;
    String name;

    public void voice() {
        System.out.println("Voice method override");
    }
    Cat(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Cat cat) {
        return age-cat.age;
    }
}
