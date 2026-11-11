public abstract class Vehicle implements Serviceable {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
    System.out.println(brand + " " + model + ", Year: " + year);
    }

    public abstract void moveForward();
    public abstract void moveBackward();
    public abstract void moveLeft();
    public abstract void moveRight();

    public void service() {
    }

}