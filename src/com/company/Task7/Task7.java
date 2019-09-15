package com.company.Task7;

public class Task7 {

    public class InnerClass{
        InnerClass(){
            System.out.println("Object of Inner Class");
        }
        void anonymous(){
            System.out.println("Object of Inner Class");
        }
    }

    public static class StaticInnerClass{
        StaticInnerClass(){
            System.out.println("Object of Static Inner Class");
        }
    }

    public void start(){
        new InnerClass();
        new StaticInnerClass();

        ForAnonymous anonymous = new ForAnonymous(){
            void print(){
                System.out.println("Object of Anonymous Class");
            }
        };
        anonymous.print();

        class LocalClass{
            LocalClass(){
                System.out.println("Object of Local Class");
            }
        }
        new LocalClass();
    }
}
