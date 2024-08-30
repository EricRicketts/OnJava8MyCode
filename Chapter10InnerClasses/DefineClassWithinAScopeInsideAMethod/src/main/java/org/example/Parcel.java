package org.example;

public class Parcel {
    public String internalTracking(boolean b) {
        String trackingSlipId = "";
        if (b) {
            class TrackingSlip {
                private final String id;
                TrackingSlip(String id) {
                    this.id = id;
                }
                String getId() { return id; }
            }
            TrackingSlip trackingSlip = new TrackingSlip("trackingSlip");
            trackingSlipId = trackingSlip.getId();
        }
        return trackingSlipId;
    }
}
/*
    In this case, the TrackingSlip class is defined within the scope of a block within a method.  An If
    statement is declared within the method and it is followed by a code block.  Here is where the class
    is defined.

    References to the class are confined to the block.  Any references to the class within the method but
    outside the block will not be recognized by Java.  One can think of this scoping as the same as a local
    variable defined within the block.
*/
