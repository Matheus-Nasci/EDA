package org.example;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Evento extends Local{

    private List<Participante> participantes;
    private String nome;
    private Date dtEvento;
    private Date inicio;
    private Date fim;

    public Evento(String rua, Integer numero, String cep, String nome, Date dtEvento, Date inicio, Date fim) {
        super(rua, numero, cep);
        participantes = new ArrayList<>();
        this.nome = nome;
        this.dtEvento = dtEvento;
        this.inicio = inicio;
        this.fim = fim;
    }

    public List<Participante> listarParticipantes(){
        List<Participante> lista = new ArrayList<>();
        for (int i = 0; i < participantes.size(); i++) {
            var participante = participantes.get(i);
            lista.add(participante);
        }
        return lista;
    }

    public void cadastrarColaborador(Colaborador c){
        if (c != null) {
            participantes.add(c);
        }
    }

    public void cadastrarConvidado(Convidado c){
        if (c != null) {
            participantes.add(c);
        }
    }

    public List<Participante> buscarPorConvidado(){
        List<Participante> lista = new ArrayList<>();
        for (Participante p: participantes) {
            if(p instanceof Convidado){
                lista.add(p);
            }
        }
        return lista;
    }

    public List<Participante> buscarPorColaborador(){
        List<Participante> lista = new ArrayList<>();
        for (Participante p: participantes) {
            if(p instanceof Colaborador){
                lista.add(p);
            }
        }
        return lista;
    }
}
