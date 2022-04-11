package hw14.vehicles;

import hw14.details.Engine;

public class Lorry extends Car{
    private double loadCapacity;
    public String carClass = "Lorry";

    public Lorry(){}

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }


    public Lorry(Engine engine, String name, String mark, double loadCapacity) {
        super(engine, name, mark);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry {" +
                "carClass='" + carClass + '\'' +
                ", mark='" + mark + '\'' +
                ", " + engine +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}