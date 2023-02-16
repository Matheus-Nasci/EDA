package org.example;

public class Coordenador extends Educador{
    private Integer qtdHorasCoordenacao;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, String email, Integer qtdHorasCoordenacao, Double valorHoraCoordenacao) {
        super(nome, email);
        this.qtdHorasCoordenacao = qtdHorasCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorBonus() {
        return qtdHorasCoordenacao * valorHoraCoordenacao * 4.5 * 0.2;
    }

    public Integer getQtdHorasCoordenacao() {
        return qtdHorasCoordenacao;
    }

    public void setQtdHorasCoordenacao(Integer qtdHorasCoordenacao) {
        this.qtdHorasCoordenacao = qtdHorasCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public String toString() {
        return String.format("Coordenador: Quantidade Hora Coordenando: %d," +
                " Valor Hora: %.2f, Bônus: %.2f",qtdHorasCoordenacao ,valorHoraCoordenacao, getValorBonus());
    }
}
