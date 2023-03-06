package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("Digite o valor do vetor [%d]: ", i));
            vetor[i] = leitor.nextInt();
        }

        Integer contador = 0;
        System.out.println("Qual número deseja achar? ");
        Integer numero = leitor.nextInt();
        for (int i = vetor.length - 1; i > 0; i--) {
            if (numero.equals(vetor[i])){
                contador++;
            }
        }
        System.out.println(String.format("o número %d ocorre %d vezes", numero, contador));
    }
}