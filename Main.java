public class Main {

    // Accepts any object that extends Vehicle.
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        System.out.println("=== 1. Parent Reference ===");
        System.out.println();

        Vehicle vehicle = new Car("Toyota", "Corolla", 2020, 4);
        vehicle.displayInfo();

        vehicle = new Motorcycle("Kawasaki", "Ninja", 2017, "supercharged");
        vehicle.displayInfo();

        vehicle = new Truck("Ford", "F-100", 1965, 1000);
        vehicle.displayInfo();


        System.out.println("=== 2. Method Parameter ===");
        System.out.println();

        Car car = new Car("Honda", "Civic", 2015, 4);

        Motorcycle motorcycle =
                new Motorcycle("Honda", "CB750 Hornet", 2022, "755cc");

        Truck truck =
                new Truck("Mitsubishi", "Strada", 2021, 1200);

        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);


        System.out.println("=== 3. Polymorphic Array ===");
        System.out.println();

        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2020, 4),
            new Motorcycle("Yamaha", "YZF-R1", 2015, "998cc"),
            new Truck("Ford", "F-100", 1965, 1000)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
        }
    }
}