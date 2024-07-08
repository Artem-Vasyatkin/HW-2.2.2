public class Main {
    public static void main(String[] args) {


        Car car = new Car("Sedan", 4);
        Car car2 = new Car("Сoupe", 4);


        Truck truck = new Truck("Passenger truck", 6);
        Truck truck2 = new Truck("Cargo truck", 8);


        Bicycle bicycle = new Bicycle("bike", 2);
        Bicycle bicycle2 = new Bicycle("BMX", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}



