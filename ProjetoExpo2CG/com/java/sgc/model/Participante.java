package com.java.sgc.model;

import com.java.sgc.util.Exceptions.IdadeValidaException;
import com.java.sgc.util.Exceptions.NomeInvalidoException;
import com.java.sgc.util.Validacoes;

public abstract class Participante {

    protected String nome;
    protected int idade;
    protected String curso;
    protected String ano;

    protected Participante(String nome, int idade, String curso, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.ano = ano;
    }

    protected Participante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        result = prime * result + ((curso == null) ? 0 : curso.hashCode());
        result = prime * result + ((ano == null) ? 0 : ano.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Participante other = (Participante) obj;
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        if (idade != other.idade) {
            return false;
        }
        if (curso == null) {
            if (other.curso != null) {
                return false;
            }
        } else if (!curso.equals(other.curso)) {
            return false;
        }
        if (ano != other.ano) {
            return false;
        }
        return true;
    }

}
