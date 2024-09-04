package org.example;

public class MyIncrement {
    public String increment() {
        return "MyIncrement.this.increment()";
    }

    public static String f(MyIncrement mi) { return mi.increment(); }
}
