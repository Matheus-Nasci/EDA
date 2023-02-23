package org.example;

public class Colaborador extends Participante{

    private Boolean permissao;

    public Colaborador(String nome, String documento, String email, String telefone, Boolean permissao) {
        super(nome, documento, email, telefone);
        this.permissao = permissao;
    }

    @Override
    public Double calcularIngresso() {
        return 10 + (50 * 0.10);
    }
}
