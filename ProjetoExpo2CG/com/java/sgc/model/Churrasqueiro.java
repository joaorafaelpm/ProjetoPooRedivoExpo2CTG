package com.java.sgc.model;

import com.java.sgc.model.Participante;

public class Churrasqueiro extends Participante{
    private String utensilios;

    public Churrasqueiro(String nome, int idade, String curso, String classe, String utensilios) {
        super(nome, idade, curso, classe);
        this.utensilios = utensilios;
        
    }

    public String getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(String utensilios) {
        this.utensilios = utensilios;
    }
    
}
