package com.toxisoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bottles bottles = new Bottles();

        boolean keepReading = true;
        String input = "";
        int minutes = 0;

        while (keepReading) {
            System.out.print("Ingrese numero de minutos (val. entero): ");
            try {
                input = scanner.nextLine();
                minutes = Integer.parseInt(input);
                keepReading = false;
            } catch (NumberFormatException e) {
                System.out.println(" - Valor no valido, ingresa solo valores enteros.");
                keepReading = true ;
            }
        }
        bottles.setMinutes(minutes);
        System.out.println(bottles.toString());
    }
}
