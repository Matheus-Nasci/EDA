package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    List<IBonus> bonados;

    public ControleBonus() {
        bonados = new ArrayList<>();
    }

    public void adicionarBonus(IBonus e) {
        bonados.add(e);
    }

    public void exibirTodos() {
        for (IBonus b : bonados) {
            System.out.println(b);
        }
    }

    public void calcularTotalBonus(){
        Double total = 0.0;
        for (IBonus b : bonados) {
            total =+ b.getValorBonus();
        }
    }
}
