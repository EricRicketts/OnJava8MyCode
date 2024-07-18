package org.example;

public class OrderOfInitialization {

    /*
        This is important to understand.  Java works from the top down and sees if, in this case, the methods are
        defined for the initialization requirements.  So it starts with private int i = f();  It moves down the statements
        and sees if f() is defined.  It is so "i" gets initialized.  Now we move onto private int j = g(i); So now we
        ask, "Are both g() and i defined?".  The answer is yes, "i" was defined in the previous statement and the method
        g(int n) is defined.  If private int j = g(i) came before private int i = f(); then int j = g(i) would be an
        illegal forward reference as "i" is not yet defined.
     */
    private int i = f();
    private int j = g(i);
    int f() { return 11; }
    int g(int n) { return n * 10; }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
