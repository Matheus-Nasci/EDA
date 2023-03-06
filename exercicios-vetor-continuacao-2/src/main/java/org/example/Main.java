package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] diaDoMes = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Qual dia do mês? ");
        Integer dia = leitor.nextInt();

        System.out.println("Qual o mês? ");
        Integer mes = leitor.nextInt();

        Integer diaDoAno = 0;
        for (int i = 0; i < mes - 1; i++) {
            diaDoAno += diaDoMes[i];
        }

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano.", dia, mes, diaDoAno + dia));
    }
}