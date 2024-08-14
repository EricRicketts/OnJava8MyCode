package org.example;

public interface One {
    String x = "Foo";

    static String getX() {
        return x;
    }

    String first();
}
/*
    I am adding this code, the static field and static method in interface One to show that it can be done.  While
    static methods in an Interface make sense in that as they are added, developers using the Interface do not have
    to change their code to accommodate them.

    Putting a lot of constants in an Interface is a bad idea.  Either declare an Enum or maybe an abstract class.
*/
