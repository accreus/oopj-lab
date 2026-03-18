package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Inside Package bpack (Class B extending A):");
        System.out.println("public pubVar: " + pubVar); // Accessible anywhere
        System.out.println("protected protVar: " + protVar); // Accessible through inheritance

        // System.out.println(privVar); // Compile Error: privVar has private access in A
        System.out.println("private privVar: Not accessible directly.");
    }
}
