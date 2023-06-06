package org.learning.java.shop;

public class Televisori extends Prodotto{

    int width;
    String smart;
    Televisori(String name, String description, double price, int width, String smart) {
        super(name, description, price);
        this.width = width;
        this.smart = smart;
    }

    public int getWidth() {
        return width;
    }

    public String getSmart() {
        return smart;
    }

    @Override
    public String toString(){
        return super.toString() + " Larghezza: " + getWidth() + "' Smart: " + getSmart();
    }
}
