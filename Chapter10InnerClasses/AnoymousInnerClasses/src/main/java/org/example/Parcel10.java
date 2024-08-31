package org.example;

public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            private String label = dest;
            private String budgetTrigger = "within Budget";
            {
                cost = Math.round(price);
                if (cost > 100) {
                    budgetTrigger = "Over Budget";
                }
            }
            /*
                public String getBudgetTrigger() { return budgetTrigger; }
                public int getCost() { return cost; }

                I originally defined these getters for fields "label" and "budgetTrigger", but found
                I could not call them.  The reason, which was given in the book, anonymous classes
                can either extend a class or implement an interface.  So, in the above code we are
                implementing the Interface Destination, meaning the only instance method available
                to us is "getLabel()".  Even though I defined methods "getBudgetTrigger()" and
                "getCost()" I found in the test, I could not call them.  They simply were not available.
            */
            @Override
            public String getLabel() { return this.label; }
        };
    }
}
/*
    The block of code after the assignment of the field "budgetTrigger" is what the book refers to as an
    "instance initializer".  With an anonymous class there is no named constructor, so if you have to
    preform constructor like activity with the constructor arguments (or any other constructor activity),
    there does not seem to be a way to do that.

    However, with an "instance initializer" you can perform constructor like activity.  Note any arguments
    passed to the anonymous class and used within the anonymous class must be "effectively final" that is
    they can never be changed after initialization.  The compiler will not allow this.
*/
