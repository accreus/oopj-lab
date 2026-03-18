# Pr5_3 - Access Specifiers Using Packages

## 1. apack/A.java

~~~java
package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    public A() {
        pubVar = 10;
        protVar = 20;
        privVar = 30;
    }

    public int getPrivVar() {
        return privVar;
    }
}
~~~

## 2. bpack/B.java

~~~java
package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Inside Package bpack (Class B extending A):");
        System.out.println("public pubVar: " + pubVar);
        System.out.println("protected protVar: " + protVar);

        // System.out.println(privVar); // Compile Error: privVar has private access in A
        System.out.println("private privVar: Not accessible directly.");
    }
}
~~~

## 3. cpack/C.java

~~~java
package cpack;

import apack.A;

public class C {
    public void display() {
        A objA = new A();
        System.out.println("\nInside Package cpack (Class C using A):");
        System.out.println("public pubVar: " + objA.pubVar);

        // System.out.println(objA.protVar); // Compile Error: protVar has protected access in A
        System.out.println("protected protVar: Not accessible (different package, non-subclass).");

        // System.out.println(objA.privVar); // Compile Error: privVar has private access in A
        System.out.println("private privVar: Not accessible directly.");
    }
}
~~~

## 4. dpack/ProtectedDemo.java

~~~java
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        System.out.println("Name: Jwalin Enr: 250413107015");

        B objB = new B();
        objB.display();

        C objC = new C();
        objC.display();
    }
}
~~~
