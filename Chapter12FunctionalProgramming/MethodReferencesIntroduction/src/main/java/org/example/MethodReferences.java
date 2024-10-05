package org.example;

public class MethodReferences {
    static String hello(String name) {
        return "Hello " + name;
    }

    static class Description {
        String about;
        Description(String desc) { this.about = desc; }
        String help(String msg) {
            return this.about + " " + msg;
        }
    }

    static class Helper {
        static String assist(String msg) {
            return msg;
        }
    }
}
