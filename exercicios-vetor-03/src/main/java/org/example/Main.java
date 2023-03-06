package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] vetor = new String[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("Digite um nome - vetor [%d]: ", i));
            vetor[i] = leitor.next();
        }

        System.out.println("Qual nome que deseja procurar?");
        String nome = leitor.next();
        for (int i = 0; i < vetor.length; i++) {
            Boolean nomeEncontrado = false;

            if (nome.equalsIgnoreCase(vetor[i])){
                nomeEncontrado = true;

                if (nomeEncontrado){
                    System.out.println(String.format("Nome encontrado no índice %d", i));
                } else{
                    System.out.println("Nome não encontrado");
                }
            }

        }

    }
}