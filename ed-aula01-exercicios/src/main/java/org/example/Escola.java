package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola{
    private String nome;
    private List<Aluno> alunos;

    public Escola(){
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a){
        alunos.add(a);
    }

    public void exibirTodos(){
        for (Aluno a: alunos) {
            System.out.println(a);
        }
    }

    public void exibirAlunosGraduacao(){
        for (Aluno a: alunos) {
            if (a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
    }

    public void exibirAprovados(){
        for (Aluno a: alunos) {
            Double media = a.calculaMedia();
            if (media >= 6){
                System.out.println(a);
            }
        }
    }

    public void buscarAluno(String ra){
        for (Aluno a: alunos) {
            if (a.getRa().equals(ra)){
                System.out.println(a);
            }
        }
    }
}
