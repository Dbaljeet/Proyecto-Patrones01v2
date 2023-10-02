package Products;

public class FactoryProduct implements IFactoryProduct{

    public Products.IProduct createProduct(String type, int id, String brand, String model, int unitPrice) {
        IProduct product;
        switch (type){
            case ("Computer"):
                return new Computer(id, brand, model, unitPrice);
            case  ("Mouse"):
                return new Mouse(id, brand, model, unitPrice);
            case  ("Display"):
                return new Display(id, brand, model, unitPrice);
            default:
                return null;
        }
    }
}
