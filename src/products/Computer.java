package products;


import builders.IBuilderProduct;
public class Computer extends Product {
    public String cpu;
    public int ramGB;
    public int hddGB;

    // Constructor
    public Computer() {
        // Constructor por defecto
    }

    // Setter para CPU
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    // Getter para CPU
    public String getCpu() {
        return cpu;
    }

    // Setter para RAM
    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    // Getter para RAM
    public int getRamGB() {
        return ramGB;
    }

    // Setter para HDD
    public void setHddGB(int hddGB) {
        this.hddGB = hddGB;
    }

    // Getter para HDD
    public int getHddGB() {
        return hddGB;
    }
}