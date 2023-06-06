package org.learning.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        double totalAmount = 0;
        double discountSmartphoneBelow32GB = 0.95;
        double discountSmartphoneAbove32GB = 0.98;

        System.out.println("Hai la carta fedeltà? se sì, digita 1 altrimenti digita 2");
        int fidelityCard =  keyboardInput.nextInt();
        keyboardInput.nextLine();

        System.out.println("Quanti televisori vuoi acquistare?");
        int numberOfTv =  keyboardInput.nextInt();
        keyboardInput.nextLine();

        for (int i = 1; i <= numberOfTv; i++) {
            System.out.println("inserisci nome: ");
            String name = keyboardInput.nextLine();
            System.out.println("inserisci descrizione: ");
            String description = keyboardInput.nextLine();
            System.out.println("inserisci prezzo (l'iva verrà applicata al checkout): ");
            double price = keyboardInput.nextDouble();
            keyboardInput.nextLine();
            System.out.println("inserisci larghezza: ");
            int width = keyboardInput.nextInt();
            keyboardInput.nextLine();
            System.out.println("inserisci se è smart o no: ");
            String smart = keyboardInput.nextLine();

            Televisori television1 = new Televisori(name,description, price, width, smart);
            totalAmount = totalAmount + television1.getFullPrice();
            System.out.println("Oggetto aggiunto: " + television1 + "\n");
        }

        System.out.println("Quanti cuffie vuoi acquistare?");
        int numberOfHeadphones =  keyboardInput.nextInt();
        keyboardInput.nextLine();

        for (int i = 1; i <= numberOfHeadphones; i++) {
            System.out.println("inserisci nome: ");
            String name = keyboardInput.nextLine();
            System.out.println("inserisci descrizione: ");
            String description = keyboardInput.nextLine();
            System.out.println("inserisci prezzo (l'iva verrà applicata al checkout): ");
            double price = keyboardInput.nextDouble();
            keyboardInput.nextLine();
            System.out.println("inserisci colore: ");
            String color = keyboardInput.nextLine();
            System.out.println("inserisci se è bluethoot o no: ");
            String bluethoot = keyboardInput.nextLine();

            Cuffie headphones1 = new Cuffie(name,description, price, color, bluethoot);
            totalAmount = totalAmount + headphones1.getFullPrice();
            System.out.println("Oggetto aggiunto: " + headphones1 + "\n");
        }

        System.out.println("Quanti smartphones vuoi acquistare?");
        int numberOfSmartphone =  keyboardInput.nextInt();
        keyboardInput.nextLine();

        for (int i = 1; i <= numberOfSmartphone; i++) {
            System.out.println("inserisci nome: ");
            String name = keyboardInput.nextLine();
            System.out.println("inserisci descrizione: ");
            String description = keyboardInput.nextLine();
            System.out.println("inserisci prezzo (l'iva verrà applicata al checkout): ");
            double price = keyboardInput.nextDouble();
            keyboardInput.nextLine();
            System.out.println("inserisci ram: ");
            int color = keyboardInput.nextInt();
            keyboardInput.nextLine();


            Smartphone smartphone1 = new Smartphone(name,description, price, color);

            if (fidelityCard == 1){
                if (smartphone1.getRam()>=32){
                    totalAmount = totalAmount + smartphone1.getFullPrice()*discountSmartphoneAbove32GB;
                }else {
                    totalAmount = totalAmount + smartphone1.getFullPrice()*discountSmartphoneBelow32GB;
                }
            }else{
                totalAmount = totalAmount + smartphone1.getFullPrice();
            }

            System.out.println("Oggetto aggiunto: " + smartphone1 + "\n");
        }

        System.out.printf("Totale carrello (+iva): %.2f €", totalAmount );
    }
}
