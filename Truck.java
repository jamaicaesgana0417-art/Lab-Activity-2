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
}