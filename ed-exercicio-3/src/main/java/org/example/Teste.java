package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        //Scanner txt = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println(
                "1. Adicionar Livro\n" +
                        "2. Adicionar DVD\n" +
                        "3. Adicionar Serviço\n" +
                        "4. Exibir Itens do carrinho\n" +
                        "4. Exibir total de vendas\n" +
                        "6. Fim\n");

        System.out.println("Qual opção você deseja?");
        Integer escolha = num.nextInt();

        while (escolha != 6) {
            switch (escolha) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }

            System.out.println(
                    "1. Adicionar Livro\n" +
                            "2. Adicionar DVD\n" +
                            "3. Adicionar Serviço\n" +
                            "4. Exibir Itens do carrinho\n" +
                            "4. Exibir total de vendas\n" +
                            "6. Fim\n");

            System.out.println("Qual opção você deseja?");
            escolha = num.nextInt();
        }

    }
}