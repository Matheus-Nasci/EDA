package org.example;

public class TesteAluno {
    public static void main(String[] args) {
        AlunoFundamental af = new AlunoFundamental("012312","Jose Paul",7.0,9.5,8.75,10.0);
        AlunoGraduacao ag = new AlunoGraduacao("0122300","Matheus",9.5,8.23);
        AlunoGraduacao ag2 = new AlunoGraduacao("012910","Andrey",9.23,7.1);
        AlunoPos ap = new AlunoPos("011123","Samuel",10.0,7.5,9.3);

        Escola SPTech = new Escola();
        SPTech.adicionarAluno(af);
        SPTech.adicionarAluno(ag);
        SPTech.adicionarAluno(ag2);
        SPTech.adicionarAluno(ap);

        System.out.println("Lista de Alunos");
        SPTech.exibirTodos();

        System.out.println("Alunos Graduacao");
        SPTech.exibirAlunosGraduacao();

        System.out.println("Lista De Aprovados!");
        SPTech.exibirAprovados();

        //Coloquei String por conta do RA que começa com 0 a esquerda
        SPTech.buscarAluno("012312");
    }
}