package org.example;

public class Perfume extends  Produto{
    private String fragancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.27;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    @Override
    public String toString() {
        return String.format("Código: %d, Descrição: %s, Preço: %.2f, " +
                "Fragrância: %s, Valor Tributo: %.2f", super.getCodigo(), super.getDescricao(), super.getPreco(), fragancia, getValorTributo());
    }
}
