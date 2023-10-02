package Products;

public interface IFactoryProduct {
    public IProduct createProduct(String type, int id, String brand, String model, int unitPrice);
}
