package org.example;

public class Alimento extends Produto{

    private Integer qtdVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer qtdVitamina) {
        super(codigo, descricao, preco);
        this.qtdVitamina = qtdVitamina;
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    public Integer getQtdVitamina() {
        return qtdVitamina;
    }

    public void setQtdVitamina(Integer qtdVitamina) {
        this.qtdVitamina = qtdVitamina;
    }

    @Override
    public String toString() {
        return String.format("Código: %d, Descrição: %s, Preço: %.2f, " +
                "Quantidade Vitamina: %d, Valor Tributo: %.2f", super.getCodigo(), super.getDescricao(), super.getPreco(), qtdVitamina, getValorTributo());
    }
}
