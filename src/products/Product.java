package products;

public abstract class Product {
    public int idProducto;
    public String marca;
    public String modelo;
    public double precioUnitario;

    // Constructor
    public Product() {
        // Constructor por defecto
    }

    // Setter para ID de producto
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    // Getter para ID de producto
    public int getIdProducto() {
        return idProducto;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para precio unitario
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Getter para precio unitario
    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
