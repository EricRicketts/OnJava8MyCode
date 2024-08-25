package org.example;

public class DotNew {
    public class Inner {
        public String h() { return "DotNew.Inner.h()"; }
        public String j() { return this.h(); }
    }
}
