package org.example;

public class WaterSource {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WaterSource() {
        status = "Constructed";
    }

    @Override
    public String toString() {
        return status;
    }
}
