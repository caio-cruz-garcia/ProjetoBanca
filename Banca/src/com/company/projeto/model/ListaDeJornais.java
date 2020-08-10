package com.company.projeto.model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeJornais {
    private List<Jornal> meusJornais;

    public ListaDeJornais(){
        this.meusJornais = new ArrayList<>();
    }

    public void addJornal(Jornal jornal){
        this.meusJornais.add(jornal);
    }

    @Override
    public String toString() {
        return "ListaDeJornais{" +
                "meusJornais=" + meusJornais +
                '}';
    }

    public final List<Jornal> getMeusJornais() {
        return this.meusJornais;
    }
}
