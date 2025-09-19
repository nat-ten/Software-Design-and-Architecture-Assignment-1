public class SmartBulb extends Product{
    String brand;
    int power;

    SmartBulb(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    @Override
    void print() {
        System.out.println("Brand: " + brand +
                           ". Power: " + power);
    }
}
