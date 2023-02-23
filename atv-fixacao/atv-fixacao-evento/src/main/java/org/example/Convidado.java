package org.example;

public class Convidado extends Participante{

    private Boolean hasInvite;

    public Convidado(String nome, String documento, String email, String telefone, Boolean hasInvite) {
        super(nome, documento, email, telefone);
        this.hasInvite = hasInvite;
    }

    @Override
    public Double calcularIngresso() {
        return 90 + (45.31 * 0.20);
    }
}
