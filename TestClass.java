import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Product> BrandAProducts = new ArrayList<>();
        List<Product> BrandBProducts = new ArrayList<>();

        FactoryA factoryA = new FactoryA("BrandA", 100, 95);
        FactoryB factoryB = new FactoryB("BrandB", 75, 60);

        BrandAProducts.add(factoryA.createBulb());
        BrandAProducts.add(factoryA.createLock());
        BrandBProducts.add(factoryB.createBulb());
        BrandBProducts.add(factoryB.createLock());

        for (int i = 0; i < BrandAProducts.size(); i++) {
            BrandAProducts.get(i).print();
        }
        for (int i = 0; i < BrandBProducts.size(); i++) {
            BrandBProducts.get(i).print();
        }
    }
}