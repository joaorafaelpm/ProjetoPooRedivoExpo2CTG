package com.java.sgc.model;


public class    Churrasqueiro extends Participante{
    private String utensilios;

    public Churrasqueiro(String nome, int idade, String curso, String utensilios, String ano) {
        super(nome, idade, curso, ano);
        this.utensilios = utensilios;
        
    }

    public String getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(String utensilios) {
        this.utensilios = utensilios;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((utensilios == null) ? 0 : utensilios.hashCode());
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
        Churrasqueiro other = (Churrasqueiro) obj;
        if (utensilios == null) {
            if (other.utensilios != null)
                return false;
        } else if (!utensilios.equals(other.utensilios))
            return false;
        return true;
    }

    
}
