package com.java.sgc.model;

public abstract class Participante {

    protected String nome;
    protected int idade;
    protected String curso;
    protected String classe;
    
    public Participante(String nome, int idade, String curso, String classe){

        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.classe = classe;
    }
        
    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
