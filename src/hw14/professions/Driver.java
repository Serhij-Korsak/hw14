package hw14.professions;

public class Driver extends Person{

    private double experience;

    public Driver(){
        super();
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public Driver(String name, String surname, double age, double experience) {
        super(name, surname, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver {"+ super.toString() +
                ", experience= " + experience +
                '}';
    }
}
