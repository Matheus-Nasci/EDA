package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        System.out.println(
                "1. Adicionar Livro\n" +
                        "2. Adicionar DVD\n" +
                        "3. Adicionar Serviço\n" +
                        "4. Exibir Itens do carrinho\n" +
                        "5. Exibir total de vendas\n" +
                        "6. Fim\n");

        System.out.println("Qual opção você deseja?");
        Integer escolha = num.nextInt();

        while (escolha != 6) {
            switch (escolha) {
                case 1:
                    System.out.println("Código: ");
                    Integer codigo = num.nextInt();

                    System.out.println("Preco Custo: ");
                    Double precoCusto = num.nextDouble();

                    System.out.println("Nome Livro: ");
                    String nome = txt.nextLine();

                    System.out.println("Autor: ");
                    String autor = txt.nextLine();

                    System.out.println("ISBN: ");
                    String isbn = txt.nextLine();

                    Livro livroNovo = new Livro(codigo, precoCusto, nome, autor, isbn);
                    carrinho.adicionarVendavel(livroNovo);
                    break;
                case 2:
                    System.out.println("Código: ");
                    Integer codigoDvd = num.nextInt();

                    System.out.println("Preço Custo: ");
                    Double precoCustoDvd = num.nextDouble();

                    System.out.println("Nome DVD: ");
                    String nomeDvd = txt.nextLine();

                    System.out.println("Gravadora: ");
                    String gravadora = txt.nextLine();

                    DVD dvdNovo = new DVD(codigoDvd, precoCustoDvd, nomeDvd, gravadora);
                    carrinho.adicionarVendavel(dvdNovo);
                    break;
                case 3:
                    System.out.println("Descrição: ");
                    String descricao = txt.nextLine();

                    System.out.println("Código: ");
                    Integer codigoServico = num.nextInt();

                    System.out.println("Nome Livro: ");
                    Integer qtdHoras = num.nextInt();

                    System.out.println("Autor: ");
                    Double valorHora = num.nextDouble();

                    Servico servicoNovo = new Servico(descricao, codigoServico, qtdHoras, valorHora);
                    carrinho.adicionarVendavel(servicoNovo);
                    break;
                case 4:
                    carrinho.exibirItensCarrinho();
                    break;
                case 5:
                    carrinho.calcularTotalVendavel();
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