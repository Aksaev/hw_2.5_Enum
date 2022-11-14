package transport;

import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Main {
    public static void main(String[] args) {

        // Легковые автомобили
        System.out.println("-------------------");
        System.out.println("Легковые автомобили");
        System.out.println("-------------------");

        Car ladaGrande = new Car("Lada", "Grande", 1.7f, BodyType.SEDAN);
        Car audiA8 = new Car("Audi", "A8", 3.0f, BodyType.SEDAN);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f, BodyType.SEDAN);
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2.4f, BodyType.CROSSOVER);

        DriverB driverBladaGrande = new DriverB("Иванов", 1, ladaGrande);
        DriverB driverBaudiA8 = new DriverB("Петров", 2, audiA8);
        DriverB driverBbmwZ8 = new DriverB("Семенов", 2, bmwZ8);
        DriverB driverBkiaSportage4 = new DriverB("Сидоров", 3, kiaSportage4);

        System.out.println(driverBladaGrande);
        System.out.println(driverBaudiA8);
        System.out.println(driverBbmwZ8);
        System.out.println(driverBkiaSportage4);
        System.out.println("-------------------");

        ladaGrande.pitStop();
        ladaGrande.getBestLapTime();
        ladaGrande.getMaxSpeed();
        ladaGrande.printType();
        System.out.println("-------------------");

        audiA8.pitStop();
        audiA8.getBestLapTime();
        audiA8.getMaxSpeed();
        audiA8.printType();
        System.out.println("-------------------");

        bmwZ8.pitStop();
        bmwZ8.getBestLapTime();
        bmwZ8.getMaxSpeed();
        bmwZ8.printType();
        System.out.println("-------------------");

        kiaSportage4.pitStop();
        kiaSportage4.getBestLapTime();
        kiaSportage4.getMaxSpeed();
        kiaSportage4.printType();

        // Грузовые автомобили
        System.out.println("-------------------");
        System.out.println("Грузовые автомобили");
        System.out.println("-------------------");

        Truck maz = new Truck("Maz", "111", 12.7f, CapacityType.N3);
        Truck kamaz = new Truck("Kamaz", "222", 13.0f, CapacityType.N1);
        Truck volvo = new Truck("Volvo", "333", 15.5f, CapacityType.N2);
        Truck man = new Truck("Man", "444", 16.4f, CapacityType.N3);

        DriverC driverCmaz = new DriverC("Квасов", 11, maz);
        DriverC driverCkamaz = new DriverC("Пупкин", 8, kamaz);
        DriverC driverCvolvo = new DriverC("Захаров", 15, volvo);
        DriverC driverCman = new DriverC("Карпин", 12, man);

        System.out.println(driverCmaz);
        System.out.println(driverCkamaz);
        System.out.println(driverCvolvo);
        System.out.println(driverCman);
        System.out.println("-------------------");

        maz.pitStop();
        maz.getBestLapTime();
        maz.getMaxSpeed();
        maz.printType();
        System.out.println("-------------------");

        kamaz.pitStop();
        kamaz.getBestLapTime();
        kamaz.getMaxSpeed();
        kamaz.printType();
        System.out.println("-------------------");

        volvo.pitStop();
        volvo.getBestLapTime();
        volvo.getMaxSpeed();
        volvo.printType();
        System.out.println("-------------------");

        man.pitStop();
        man.getBestLapTime();
        man.getMaxSpeed();
        man.printType();

        // Автобусы
        System.out.println("-------------------");
        System.out.println("Автобусы");
        System.out.println("-------------------");

        Bus paz = new Bus("Paz", "5df", 4.75f, PlaceType.SMALL);
        Bus gazel = new Bus("Gazel", "67ju", 7.5f, PlaceType.ESPECIALLY_SMALL);
        Bus ford = new Bus("Ford", "90hg", 3.5f, PlaceType.MEDIUM);
        Bus jac = new Bus("Jac", "76dr", 6.4f, PlaceType.LARGE);

        DriverD driverDpaz = new DriverD("Смирнов", 3, paz);
        DriverD driverDgazel = new DriverD("Губарев", 14, gazel);
        DriverD driverDford = new DriverD("Левкин", 8, ford);
        DriverD driverDjac = new DriverD("Голубев", 6, jac);

        System.out.println(driverDpaz);
        System.out.println(driverDgazel);
        System.out.println(driverDford);
        System.out.println(driverDjac);
        System.out.println("-------------------");

        paz.pitStop();
        paz.getBestLapTime();
        paz.getMaxSpeed();
        paz.printType();
        System.out.println("-------------------");

        gazel.pitStop();
        gazel.getBestLapTime();
        gazel.getMaxSpeed();
        gazel.printType();
        System.out.println("-------------------");

        ford.pitStop();
        ford.getBestLapTime();
        ford.getMaxSpeed();
        ford.printType();
        System.out.println("-------------------");

        jac.pitStop();
        jac.getBestLapTime();
        jac.getMaxSpeed();
        jac.printType();

    }

}