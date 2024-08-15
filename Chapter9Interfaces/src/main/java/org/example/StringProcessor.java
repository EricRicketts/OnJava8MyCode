package org.example;

public interface StringProcessor extends Processor {

    String S = "If she weighs the same as a duck, she's made of wood";
    @Override
    String process(Object input);

    static String applyAll() {
        return Applicator.apply(new Upcase(), S) + Applicator.apply(new Downcase(), S) +
                Applicator.apply(new Splitter(), S);
    }
}
