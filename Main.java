public class Main {

    public static void main(String[] args) {

        Vehicle V1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle V2 = new Vehicle("Ford", "Civic", 1965);
        Vehicle V3 = new Vehicle("Honda", "Civic", 2015);

        V1.displayInfo();
        V2.displayInfo();
        V3.displayInfo();

        System.out.println();

        System.out.println("V1 Age: " + V1.calculateAge());
        System.out.println("V2 Age: " + V2.calculateAge());
        System.out.println("V3 Age: " + V3.calculateAge());

        System.out.println();

        System.out.println("V1 Vintage: " + V1.isVintage());
        System.out.println("V2 Vintage: " + V2.isVintage());
        System.out.println("V3 Vintage: " + V3.isVintage());

        System.out.println();

        System.out.println("Brand: " + V1.getBrand());
        System.out.println("Model: " + V1.getModel());
        System.out.println("Year: " + V1.getYear());

        System.out.println();

        System.out.println("setYear(2000): " + V1.setYear(2000));
        System.out.println("Stored year: " + V1.getYear());
        System.out.println("Age: " + V1.calculateAge());
        System.out.println("Vintage: " + V1.isVintage());

        System.out.println();

        System.out.println("setYear(1885): " + V1.setYear(1885));
        System.out.println("Stored year: " + V1.getYear());

        System.out.println();

        System.out.println("setYear(2027): " + V1.setYear(2027));
        System.out.println("Stored year: " + V1.getYear());

        System.out.println();

        Vehicle V4 = new Vehicle("Test", "Invalid1885", 1885);
        System.out.println("New vehicle with year 1885:");
        System.out.println("Initial year: " + V4.getYear());

        System.out.println();

        Vehicle V5 = new Vehicle("Test", "Invalid2027", 2027);
        System.out.println("New vehicle with year 2027:");
        System.out.println("Initial year: " + V5.getYear());
    }
}