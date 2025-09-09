package com.java.sgc.model;

import com.java.sgc.model.Participante;

import java.util.ArrayList;

public class Estoque  extends Participante {
    String itens;
   
   public Estoque(String nome, String itens){
       super();
       this.itens = itens;
       }

   public String getItens() {
    return itens;
   }

   public void setItens(String itens) {
    this.itens = itens;
   }

   @Override
   public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((itens == null) ? 0 : itens.hashCode());
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
    Estoque other = (Estoque) obj;
    if (itens == null) {
        if (other.itens != null)
            return false;
    } else if (!itens.equals(other.itens))
        return false;
    return true;
   }
 }   
