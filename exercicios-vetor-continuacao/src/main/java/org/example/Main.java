package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] carros = new String[2];
        Integer[] rendimento = new Integer[2];

        System.out.println("Digite 5 modelos de carro");
        for (int i = 0; i < carros.length; i++) {
            System.out.println(String.format("vetor [%d]: ", i));
            carros[i] = leitor.next();
        }

        System.out.println("Digite o rendimento desse carro:");
        for (int i = 0; i < rendimento.length; i++) {
            System.out.println(String.format("Rendimento do %s: ", carros[i]));
            rendimento[i] = leitor.nextInt();
        }

        Integer maiorRendimento = 0;
        Integer melhorCarro = 0;
        for (int i = 0; i < rendimento.length; i++) {
            if (rendimento[i] > maiorRendimento){
                maiorRendimento = rendimento[i];
                melhorCarro = i;
            }
        }

        System.out.println(String.format("O Carro mais economico " +
                "é o %s fazendo %d por litro", carros[melhorCarro], maiorRendimento));
    }
}