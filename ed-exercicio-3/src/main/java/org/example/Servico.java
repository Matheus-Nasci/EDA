package org.example;

public class Servico implements Vendavel{
    private String descricao;
    private Integer codigo;
    private Integer qtdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer qtdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorVenda() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %s, Código: %s, Quantidade Horas: " +
                "%d, valorHora: %.2f",descricao ,codigo , qtdHoras, valorHora);
    }
}
