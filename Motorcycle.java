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
}