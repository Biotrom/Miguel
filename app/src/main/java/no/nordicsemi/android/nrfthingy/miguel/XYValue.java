package no.nordicsemi.android.nrfthingy.miguel;

public class XYValue {
    private double x;
    private double y;
    private double velocityAxis;
    private double velocityAyis;
    private double distanceAxis;
    private double distanceAyis;

    private double x_pure;
    private double y_pure;

    public XYValue(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public XYValue(double x, double y, double velocityAxis, double velocityAyis, double distanceAxis, double distanceAyis){
        this.x = x;
        this.y = y;
        this.distanceAxis = distanceAxis;
        this.velocityAyis = velocityAyis;
        this.distanceAyis = distanceAyis;
        this.velocityAxis = velocityAxis;
    }

    public XYValue(double x, double y, double velocityAxis, double velocityAyis, double distanceAxis, double distanceAyis, double x_pure, double y_pure ){
        this.x = x;
        this.y = y;
        this.distanceAxis = distanceAxis;
        this.velocityAyis = velocityAyis;
        this.distanceAyis = distanceAyis;
        this.velocityAxis = velocityAxis;
        this.x_pure = x_pure;
        this.y_pure = y_pure;
    }

    public double getX_pure() {
        return x_pure;
    }

    public double getY_pure() {
        return y_pure;
    }

    public double getDistanceAxis() {
        return distanceAxis;
    }

    public double getDistanceAyis() {
        return distanceAyis;
    }

    public double getVelocityAxis() {
        return velocityAxis;
    }

    public double getVelocityAyis() {
        return velocityAyis;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "XYValue{" +
                "x=" + x +
                ", y=" + y +
                ", velocityAxis=" + velocityAxis +
                ", velocityAyis=" + velocityAyis +
                ", distanceAxis=" + distanceAxis +
                ", distanceAyis=" + distanceAyis +
                '}';
    }
}
