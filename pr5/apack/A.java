clear
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

    // Getter for private variable just to show it holds data
    public int getPrivVar() {
        return privVar;
    }
}
