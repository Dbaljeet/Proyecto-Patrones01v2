package Products;

public class Computer implements IProduct{
    private int id;
    private String brand;
    private String model;
    private int unitPrice;

    public Computer(int id, String brand, String model, int unitPrice){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.unitPrice = unitPrice;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String model() {
        return this.model;
    }

    @Override
    public int unitPrice() {
        return this.unitPrice;
    }
}
