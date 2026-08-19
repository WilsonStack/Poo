// aula 03 - 18.08.2026

package br.edu.principal;

import java.util.Scanner;



public class Principal {

    public static void main(String[] args) {

        String nome;
        double n1, n2, mf = 0, af, media;
        String situacao = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite sua nota 01: ");
        n1 = sc.nextDouble();

        System.out.println("Digite sua nota 02: ");
        n2 = sc.nextDouble();

        media = (n1 + n2) / 2;

        if(media >= 6) {

            situacao = "Aprovado";
            System.out.println("Situação: " + situacao);

            }



        else {
            if (media >= 3) {
                situacao = "Em Recuperação";
                System.out.println("Situação: " + situacao);

                System.out.println("Digite a AF: ");
                af = sc.nextDouble();
                mf = (af + media) / 2;
                if(mf >= 5) {
                    situacao = "Aprovado";

                }
                else {
                    situacao = "Reprovado em Recuperação";
                    System.out.println("Situação: " + situacao);
                }
            }
            else {
                situacao = "huahuaHUHAH";
                System.out.println("Situação: " + situacao);
            }
        }

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Média Final: " + mf );
        System.out.println("Situação: " + situacao);

    }


    }
