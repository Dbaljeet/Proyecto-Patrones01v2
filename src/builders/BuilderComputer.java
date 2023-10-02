package builders;

import products.Product;
import products.Computer;
public class BuilderComputer implements IBuilderProduct{
    private Computer computador = new Computer();

    @Override
    public void setIdProducto(int idProduct) {
        computador.setIdProducto(idProduct);
    }

    @Override
    public void setMarca(String marca) {
        computador.setMarca(marca);
    }

    @Override
    public void setModelo(String modelo) {
        computador.setModelo(modelo);
    }

    @Override
    public void setPrecioUnitario(double precioUnitario) {
        computador.setPrecioUnitario(precioUnitario);
    }

    public void setCpu(String cpu) {
        computador.setCpu(cpu);
    }

    public void setRamGB(int ramGB) {
        computador.setRamGB(ramGB);
    }

    public void setHddGB(int hddGB) {
        computador.setHddGB(hddGB);
    }

    @Override
    public Product build() {
        return computador;
    }
}
