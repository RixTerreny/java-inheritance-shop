package org.learning.java.shop;

public class Main {
    public static void main(String[] args) {

        Smartphone telefono1 = new Smartphone( "Samsung S22", "Va veloce",1344.50, 32);
        System.out.printf("Codice prodotto: %08d%n", telefono1.getCode());
        System.out.println("Nome: " + telefono1.getName());
        System.out.println("Descrizione: " + telefono1.getDescription());
        System.out.println("Prezzo senza IVA: " + telefono1.getPrice());
        System.out.println("Nome esteso: " + telefono1.getExtendedName());
        System.out.println("Prezzo con IVA: " + telefono1.getFullPrice() + "\n");
        telefono1.setName("Iphone 11");
        System.out.println("Nome modificato con il setter: " + telefono1.getName());
        System.out.println("Codice IMEI: " + telefono1.getImeiCode());
        System.out.println("Ram: " + telefono1.getRam() + " GB");
    }
}
