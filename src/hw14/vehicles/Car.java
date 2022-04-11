package hw14.vehicles;

import hw14.details.Engine;

public abstract class Car {

    public String carClass;
    public String mark;

    public Car() {

    }
    Engine engine = new Engine();

    public String getCarClass () {
        return carClass;
    }

    public String getMark () {
        return mark;
    }

    public Car(Engine engine,String name, String mark) {
        this.engine = engine;
        this.carClass = carClass;
        this.mark = mark;
    }

    public Car(Engine engine, String name, String mark, double loadCapacity) {

    }

    @Override
    public String toString() {
        return "Car {" +
                "carClass='" + carClass + '\'' +
                ", mark='" + mark + '\'' +
                ", " + engine + ','+ '\'';
    }

    public void start () {System.out.println("Let's go!");}

    public void stop(){
        System.out.println("Stop!");
    }

    public void turnRight(){
        System.out.println("Turn right");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }
}