public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Nissan", "Navarra", 1995);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2006);
        Vehicle vehicle3 = new Vehicle("Ford", "Ranger", 2018);

        System.out.println("Vehicle 1:");
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        System.out.println("Vehicle 2:");
        System.out.println("Brand: " + vehicle2.getBrand());
        System.out.println("Model: " + vehicle2.getModel());
        System.out.println("Year: " + vehicle2.getYear());
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        System.out.println("Vehicle 3:");
        System.out.println("Brand: " + vehicle3.getBrand());
        System.out.println("Model: " + vehicle3.getModel());
        System.out.println("Year: " + vehicle3.getYear());
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        System.out.println();

        System.out.println("Testing setYear on Vehicle 1");
        System.out.println("setYear(2000) => " + vehicle1.setYear(2000) + "; year is " + vehicle1.getYear() + "; age " + vehicle1.calculateAge() + "; vintage " + vehicle1.isVintage());
        System.out.println("setYear(1885) => " + vehicle1.setYear(1885) + "; year remains " + vehicle1.getYear());
        System.out.println("setYear(2027) => " + vehicle1.setYear(2027) + "; year remains " + vehicle1.getYear());
        System.out.println();

        Vehicle invalidLow = new Vehicle("Tesla", "Model S", 1885);
        System.out.println("New vehicle with year 1885 Initial year is " + invalidLow.getYear());

        Vehicle invalidHigh = new Vehicle("Tesla", "Model X", 2027);
        System.out.println("New vehicle with year 2027 Initial year is " + invalidHigh.getYear());
    }
}
