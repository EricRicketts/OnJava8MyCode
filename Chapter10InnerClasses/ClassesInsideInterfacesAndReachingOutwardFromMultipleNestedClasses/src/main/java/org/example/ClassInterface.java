package org.example;

public interface ClassInterface {
    String howdy();

    class ClassWithinInterface implements ClassInterface {
        @Override
        public String howdy() {
            return "Howdy!!  class ClassWithinInterface contained in interface ClassInterface";
        }
    }
}
