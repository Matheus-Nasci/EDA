package org.example;

public class DVD extends Produto{
    private String nome;
    private String gravadora;

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() + (getPrecoCusto() * 0.20);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Gravadora: %s, Código: " +
                "%d, Preço: %.2f",nome ,gravadora ,super.getCodigo(), super.getPrecoCusto());
    }
}
