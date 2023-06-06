package org.learning.java.shop;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone( "Samsung S22", "Va veloce",1344.50, 32);
//        System.out.printf("Codice prodotto: %08d%n", smartphone1.getCode());
//        System.out.println("Nome: " + smartphone1.getName());
//        System.out.println("Descrizione: " + smartphone1.getDescription());
//        System.out.println("Prezzo senza IVA: " + smartphone1.getPrice());
//        System.out.println("Nome esteso: " + smartphone1.getExtendedName());
//        System.out.println("Prezzo con IVA: " + smartphone1.getFullPrice() + "\n");
//        smartphone1.setName("Iphone 11");
//        System.out.println("Nome modificato con il setter: " + smartphone1.getName());
//        System.out.println("Codice IMEI: " + smartphone1.getImeiCode());
        System.out.println(smartphone1.toString());

        Televisori television1 = new Televisori("Sony","Oled",1220, 50, "no");
        System.out.println(television1.toString());

        Cuffie headphones1 = new Cuffie("JBL", "Potenti", 29.99, "nere", "si");
        System.out.println(headphones1.toString());
    }
}
