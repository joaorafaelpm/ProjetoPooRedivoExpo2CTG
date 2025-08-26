package com.java.sgc.model;

import com.java.sgc.model.Convidado;

public class Estoque {
    
private String carne;

private String bebida;
private String itemGeral;


public Estoque(String carne, String bebida, String itemGeral){
    this.carne = carne;
    this.bebida = bebida;
    this.itemGeral = itemGeral;
}


public String getCarne() {
    return carne;
}
public void setCarne(String carne) {
    this.carne = carne;
}

public String getBebida() {
    return bebida;
}
public void setBebida(String bebida) {
    this.bebida = bebida;
}

public String getItemGeral() {
    return itemGeral;
}
public void setItemGeral(String itemGeral) {
    this.itemGeral = itemGeral;
}
}
