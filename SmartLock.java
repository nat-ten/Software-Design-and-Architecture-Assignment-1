public class SmartLock extends Product{
    String brand;
    int battery;

    SmartLock(String brand, int battery) {
        this.brand = brand;
        this.battery = battery;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + brand +
                ". Battery: " + battery);
    }
}
