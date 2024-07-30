package org.example;

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource waterSource = new WaterSource();
    private int i;
    private double d;

    public String getValve1() {
        return valve1;
    }

    public void setValve1(String valve1) {
        this.valve1 = valve1;
    }

    public String getValve2() {
        return valve2;
    }

    public void setValve2(String valve2) {
        this.valve2 = valve2;
    }

    public String getValve3() {
        return valve3;
    }

    public void setValve3(String valve3) {
        this.valve3 = valve3;
    }

    public String getValve4() {
        return valve4;
    }

    public void setValve4(String valve4) {
        this.valve4 = valve4;
    }

    public WaterSource getWaterSource() {
        return waterSource;
    }

    public void setWaterSource(WaterSource waterSource) {
        this.waterSource = waterSource;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "valve1 = '" + valve1 + '\'' +
                ", valve2 = '" + valve2 + '\'' +
                ", valve3 = '" + valve3 + '\'' +
                ", valve4 = '" + valve4 + '\'' +
                ", waterSource = " + waterSource +
                ", i = " + i +
                ", d = " + d;
    }

    public SprinklerSystem() {
        valve1 = "first valve";
        valve2 = "second valve";
        valve3 = "third valve";
        valve4 = "fourth valve";
        i = 0;
        d = 0.0;
    }
}
