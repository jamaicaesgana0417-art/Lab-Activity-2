public class Motorcycle extends Vehicle {
    String enginetype;

    public Motorcycle(String brand, String model, int year, String enginetype){
        super(brand,model,year);
        this.enginetype = enginetype;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Engine Type: " + enginetype );
    }

    public void moveForward() {
        System.out.println("Motorcycle is moving forward.");
    }
    public void moveBackward() {
        System.out.println("Motorcycle is moving backward.");
    }
    public void moveLeft() {
        System.out.println("Motorcycle is turning left.");
    }
    public void moveRight() {
        System.out.println("Motorcycle is turning right.");
    }
}