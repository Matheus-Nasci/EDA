package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Vendavel> cart;

    public Carrinho() {
        cart = new ArrayList<>();
    }

    public void adicionarVendavel(Vendavel v){
        cart.add(v);
    }

    public Double calcularTotalVendavel(){
        Double total = 0.0;

        for (Vendavel v: cart) {
            total =+ v.getValorVenda();
        }
        return total;
    }

    public void exibirItensCarrinho(){
        System.out.println("Carrinho:");
        for (Vendavel v: cart) {
            System.out.println(v);
        }
        System.out.println("\n");
    }
}
