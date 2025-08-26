package com.java.sgc.model;

import com.java.sgc.model.Participante;

public class Convidado extends Participante {

    private String ConvidadoPorQuem;

    public Convidado(String nome, int idade, String curso, String classe, String convidadoPorQuem) {
        super(nome, idade, curso, classe);
        ConvidadoPorQuem = convidadoPorQuem;
    }

    public String getConvidadoPorQuem() {
        return ConvidadoPorQuem;
    }

    public void setConvidadoPorQuem(String convidadoPorQuem) {
        this.ConvidadoPorQuem = convidadoPorQuem;
    }

    
    
}
