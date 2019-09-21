package com.company.Task7;

public class Enclosing {

    private int enclosingPrivate=10;
    private static int enclosingPrivateStatic=10;

    int enclosingLocal=10;
    static int enclosingLocalStatic=10;

    public class InnerClass{
        InnerClass(){
            enclosingPrivate = 20;
            enclosingPrivateStatic = 20;
            System.out.println("Object of Inner Class." +
                    "\n\tEnclosingPrivate = "+enclosingPrivate+
                    "\n\tEnclosingPrivateStatic = "+enclosingPrivateStatic
            );
        }
    }

    public static class StaticInnerClass{
        StaticInnerClass(){
            enclosingPrivateStatic = 30;
            System.out.println("Object of Static Inner Class." +
                    "\n\tEnclosingPrivateStatic = "+enclosingPrivateStatic
            );
        }
    }
    void print(){;
    }
}
