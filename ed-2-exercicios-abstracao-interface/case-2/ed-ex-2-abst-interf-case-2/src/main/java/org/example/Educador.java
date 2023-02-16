package org.example;

public abstract class Educador implements IBonus{
    private String nome;
    private String email;

    public Educador(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Educador: Nome: %s, Email: %s", nome, email);
    }
}
