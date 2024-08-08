package org.example;

import java.util.Random;

class Value {
    int i;
    Value(int i) { this.i = i; }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id) { this.id = id; }
    // valueOne is a constant on each instance of FinalData, note a getter is defined
    // and this is the only way to publicly access the value.  In the case of valueOne
    // the keyword "final" makes the value of valueOne constant, but because the keyword
    // static is not used it is a final value for an instance of FinalData.
    private final int valueOne = 9;
    // in both cases for VALUE_TWO and VALUE_THREE the final keyword makes their values
    // constant, but with the addition of the static keyword they can only be accessed
    // by the class, they are not accessible by an instance of the class.
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public int getValueOne() {
        return valueOne;
    }

    public int getValueTwo() {
        // a public method is need to retrieve this value because its accessor is private
        return FinalData.VALUE_TWO;
    }

    public int getValueThree() {
        return FinalData.VALUE_THREE;
    }

    public int getValueIFour() {
        // we need a method to retrieve the value of i4 because we can only access it outside
        // of FinalData by an instance of FinalData
        return i4;
    }

    public Value getV1() {
        return v1;
    }

    public void setV1(Value v1) {
        this.v1 = v1;
    }

    public Value getV2() {
        return v2;
    }

    public Value getVAl_3() {
        return FinalData.VAL_3;
    }

    public int[] getA() {
        return a;
    }

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }
}
