public class FactoryA implements SmartDeviceFactory {
    String brand;
    int power;
    int battery;

    FactoryA(String brand, int power, int battery) {
        this.brand = brand;
        this.power = power;
        this.battery = battery;
    }

    @Override
    public Product createBulb() {
        return new SmartBulb(brand, power);
    }

    @Override
    public Product createLock() {
        return new SmartLock(brand, battery);
    }

}
