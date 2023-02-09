package org.example;

public class TestaTributo {
    public static void main(String[] args) {
        Alimento a = new Alimento(23202030,"Manteiga",8.32, 12);
        Perfume p = new Perfume(23202030,"Malbec",132.00, "Puruvudu");
        Service s = new Service("Marceneiro",2300.0);

        Tributo trib = new Tributo();

        trib.adicionaTributavel(p);
        trib.adicionaTributavel(a);
        trib.adicionaTributavel(s);

        trib.exibirTodos();

        System.out.printf("\nO total de tributos é R$ %.2f", trib.calcularTotalTributo());
    }
}