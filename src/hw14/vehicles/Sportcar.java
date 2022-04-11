package hw14.vehicles;

import hw14.details.Engine;

public class Sportcar extends Car{
    private double maxSpeed;
    public String carClass = "Sportcar";

    public Sportcar(){}

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Sportcar(Engine engine, String name, String mark, double maxSpeed) {
        super(engine, name, mark);
        this.maxSpeed = maxSpeed;
        this.carClass = "Sportcar";
    }

    @Override
    public String toString() {
        return "Sportcar {" +
                "carClass='" + carClass + '\'' +
                ", mark='" + mark + '\'' +
                ", " + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}