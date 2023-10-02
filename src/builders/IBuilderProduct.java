package builders;

import products.Product;

public interface IBuilderProduct {
    void setIdProducto(int idProducto);
    void setMarca(String marca);
    void setModelo(String modelo);
    void setPrecioUnitario(double precioUnitario);
    Product build();
}
