package cpack;

import apack.A;

public class C {
    public void display() {
        A objA = new A();
        System.out.println("\nInside Package cpack (Class C using A):");
        System.out.println("public pubVar: " + objA.pubVar); // Accessible

        // System.out.println(objA.protVar); // Compile Error: protVar has protected access in A
        System.out.println("protected protVar: Not accessible (different package, non-subclass).");

        // System.out.println(objA.privVar); // Compile Error: privVar has private access in A
        System.out.println("private privVar: Not accessible directly.");
    }
}
