package hw14.details;

public class Engine {

    protected int power;
    protected String company;

    public Engine(){}

    public int getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return
                "power=" + power +
                        ", company='" + company + '\'';
    }
}
