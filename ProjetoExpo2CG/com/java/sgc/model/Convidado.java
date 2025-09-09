package com.java.sgc.model;

public class Convidado extends Participante {

    private String convidadoPorQuem;

    public Convidado(String nome, int idade, String curso,  String convidadoPorQuem, String ano) {
        super(nome, idade, curso, ano);
        this.convidadoPorQuem = convidadoPorQuem;
    }

    public String getConvidadoPorQuem() {
        return convidadoPorQuem;
    }

    public void setConvidadoPorQuem(String convidadoPorQuem) {
        this.convidadoPorQuem = convidadoPorQuem;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((convidadoPorQuem == null) ? 0 : convidadoPorQuem.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (convidadoPorQuem == null) {
            if (other.convidadoPorQuem != null)
                return false;
        } else if (!convidadoPorQuem.equals(other.convidadoPorQuem))
            return false;
        return true;
    }



}
