package directors;
import builders.IBuilderProduct;
import products.Product;
public class DirectorProduct {
    private IBuilderProduct builder;

    public DirectorProduct(IBuilderProduct builder) {
        this.builder = builder;
    }

    // Método para construir un producto completo
    public Product construirProducto(int idProducto, String marca, String modelo, double precioUnitario) {
        builder.setIdProducto(idProducto);
        builder.setMarca(marca);
        builder.setModelo(modelo);
        builder.setPrecioUnitario(precioUnitario);

        // Configurar propiedades específicas del producto
        configurarPropiedadesEspecificas();

        // Devolver el producto construido
        return builder.build();
    }

    // Método abstracto para configurar propiedades específicas
    private void configurarPropiedadesEspecificas() {
        // Implementar en las subclases según el tipo de producto
    }
}
