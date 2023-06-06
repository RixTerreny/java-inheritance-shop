package org.learning.java.shop;

public class Smartphone extends Prodotto{

    int imeiCode;
    int ram;
    Smartphone(String name, String description, double price,int ram) {
        super(name, description, price);
        this.imeiCode = super.generateCode();
        this.ram = ram;
    }

    public int getImeiCode(){
        return this.imeiCode;
    }

    public int getRam() {
        return ram;
    }
}
