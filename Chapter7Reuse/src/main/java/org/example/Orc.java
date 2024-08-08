package org.example;

public class Orc extends Villain {
    private int orcNumber;

    public void change(String name, int orcNumber) {
       setName(name); // Orc has access to the setName method because it is protected in
        // the Villain class and Orc inherits from Villain.  The keyword protected provides
        // access only to the derived class (but it also provides package access)
       this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
}
