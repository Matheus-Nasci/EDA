package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("Valor vetor[%d]: ", i));
            vetor[i] = leitor.nextInt();
        }


        Integer media = 0;
        Integer total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
            media += total / vetor.length;
        }

        System.out.println(String.format("Média Vetor - %d", media));

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(String.format("vetor[%d]: ", i));
            System.out.print(String.format("%d, ", vetor[i]));
        }

    }
}