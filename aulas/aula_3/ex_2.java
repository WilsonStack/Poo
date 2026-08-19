package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número 1 a 7: ");
        int dia = input.nextInt();

        if (dia == 1) {
            System.out.print("Domingo");
        }

        if (dia == 2) {
            System.out.print("Segunda");
        }

        if (dia == 3) {
            System.out.print("Terça");
        }

        else {
            System.out.print("Esse dia não existe");
        }

        // SWITCH CASE

        switch (dia) {
            case 1:
                System.out.print("Domingo");
                break;

            case 2:
                System.out.print("Segunda");
                break;

            case 3:
                System.out.print("Terça");
                break;

            default:
                System.out.print("Esse dia não existe");

        }

        // SWITCH CASE MODERNO

        switch (dia) {
            case 1 -> System.out.print("Domingo");
            case 2 -> System.out.print("Segunda");
            case 3 -> System.out.print("Terça");
            default -> System.out.print("Esse Dia não existe");

        }





    }
}
