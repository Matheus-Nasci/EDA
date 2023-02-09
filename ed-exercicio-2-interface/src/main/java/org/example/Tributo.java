package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

    List<Tributavel> listaTrib;

    public Tributo() {
        listaTrib = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t) {
        listaTrib.add(t);
    }

    public Double calcularTotalTributo() {
        Double valorTotal = 0.0;
        for (Tributavel t : listaTrib) {
            valorTotal += t.getValorTributo();
        }
        return valorTotal;
    }

    public void exibirTodos(){
        for (Tributavel t : listaTrib) {
            System.out.println(t);
        }
    }
}
