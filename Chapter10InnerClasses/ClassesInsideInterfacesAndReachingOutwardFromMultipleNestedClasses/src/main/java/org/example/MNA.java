package org.example;

public class MNA {
    private String f() { return "f() in MNA."; }
    class A {
        private String g() { return "g() in MNA.A"; }
        class B {
            public String h() { return f() + " " + g() + " " + "h() in MNA.A.B"; }
        }
    }
}
