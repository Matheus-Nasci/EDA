package org.example;

public class Service implements Tributavel{

    private String descricao;
    private Double preco;

    public Service(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Double getValorTributo() {
        return preco * 0.12;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %s, Preço: %.2f, Valor Tributo: %.2f",descricao, preco, getValorTributo());
    }
}
