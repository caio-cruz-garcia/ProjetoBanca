package com.company.enumeracao;

public enum Tipos {
    JORNAL("jornal"),
    GIBI("gibis"),
    VAZIO("vazio"),
    REVISTA("revista");

    private String display;
    Tipos(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }

}
