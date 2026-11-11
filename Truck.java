public class Truck extends Vehicle implements Serviceable {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
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

    @Override
    public void moveForward() {
        System.out.println("Truck is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("Truck is moving backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Truck is turning left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Truck is turning right.");
    }
}