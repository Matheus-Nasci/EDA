package org.example;

public class Professor extends Educador{
    private Integer qtdAulaSemana;
    private Double valorHoraAula;

    public Professor(String nome, String email, Integer qtdAulaSemana, Double valorHoraAula) {
        super(nome, email);
        this.qtdAulaSemana = qtdAulaSemana;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorBonus() {
        return qtdAulaSemana * valorHoraAula * 4.5 * 0.2;
    }

    public Integer getQtdAulaSemana() {
        return qtdAulaSemana;
    }

    public void setQtdAulaSemana(Integer qtdAulaSemana) {
        this.qtdAulaSemana = qtdAulaSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return String.format("Professor: Quantidade de Aula Semana: %d," +
                " Valor Hora: %.2f, Bônus: %.2f",qtdAulaSemana ,valorHoraAula, getValorBonus());
    }
}
