package com.company.projeto.model;

import com.company.enumeracao.Tipos;

public class Jornal {
    private String nome;
    private int preco;
    private Tipos tipos;
    private int quantidade;

    public Jornal(String nome, int preco, Tipos tipos, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.tipos = tipos;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Jornal{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", tipos=" + tipos +
                ", quantidade=" + quantidade +
                '}';
    }

    public void setTipos(Tipos tipos) {
        this.tipos = tipos;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public String getTipos() {
        return ""+tipos;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
