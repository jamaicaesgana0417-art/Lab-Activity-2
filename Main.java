public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Toyota", "Corolla", 2020, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        vehicle = new Motorcycle("Kawasaki", "Ninja", 2017, "supercharged");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        vehicle = new Truck("Ford", "F-100", 1965, 1000);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        System.out.println("=== 2. Method Parameter ===");
        System.out.println();
        Car car = new Car("Honda", "Civic", 2015, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB750 Hornet", 2022, "755cc");
        Truck truck = new Truck("Mitsubishi", "Strada", 2021, 1200);
        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();

        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();

        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();

        System.out.println("=== 3. Polymorphic Array ===");
        System.out.println();
        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2020, 4),
            new Motorcycle("Yamaha", "YZF-R1", 2015, "998cc"),
            new Truck("Ford", "F-100", 1965, 1000)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();

        }
    }
}