package org.example;

public class Parcel {

     class Contents {
        private double value;

         public double getValue() {
             return value;
         }

         public Contents(double value) {
             this.value = value;
         }
     }

     class Destination {
         private String label;

         public String getLabel() {
             return label;
         }

         public Destination(String label) {
             this.label = label;
         }
     }
}
