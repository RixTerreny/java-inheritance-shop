package org.learning.java.shop;

public class Cuffie extends Prodotto{

    String color;
    String bluetooth;

    Cuffie(String name, String description, double price,String color, String bluetooth) {
        super(name, description, price);
        this.color = color;
        this.bluetooth =bluetooth;
    }

    public String getColor() {
        return color;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    @Override
    public String toString(){
        return super.toString() + " Colore: " + getColor() + " Bluethoot: " + getBluetooth();
    }
}
