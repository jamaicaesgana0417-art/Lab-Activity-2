public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(
            String brand, String model, int year, double loadCapacity) {

        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity + " kg");
        System.out.println();
    }

    public void moveForward() {
        System.out.println("Truck is moving forward.");
    }
    public void moveBackward() {
        System.out.println("Truck is moving backward.");
    }
    public void moveLeft() {
        System.out.println("Truck is turning left.");
    }
    public void moveRight() {
        System.out.println("Truck is turning right.");
    }
}