    package hw14;

    import hw14.professions.Driver;
    import hw14.vehicles.Car;
    import hw14.vehicles.Lorry;
    import hw14.vehicles.Sportcar;

    import java.time.LocalDate;
    import java.time.Period;

    public class Main {

//import hw14.professions.Driver;
//import hw14.vehicles.Car;
//import hw14.vehicles.Lorry;
//import hw14.vehicles.Sportcar;
//
//import javax.swing.text.DateFormatter;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;


        public static void main(String[] args) {

            Driver driver = new Driver();
            Car car = new Lorry();
            Car car1 = new Sportcar();

            System.out.println(driver);
            System.out.println(car);
            System.out.println(car1);

            car.start();
            car.turnRight();
            car.turnLeft();
            car.stop();

        }
    }
