package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[7];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("Digite o valor do vetor [%d]: ", i));
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Vetor normal");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Vetor Invertido");
        for (int i = vetor.length - 1; i > 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}