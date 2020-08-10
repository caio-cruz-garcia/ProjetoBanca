package com.company.projeto.parsers;

import com.company.enumeracao.Tipos;

public class TiposParsers {
    public static Tipos toTipos(String status){
        if(status.equals("Platinado")) return Tipos.GIBI;
        if(status.equals("Não Iniciado")) return Tipos.JORNAL;
        if(status.equals("Terminado")) return Tipos.REVISTA;
        else return Tipos.VAZIO;
    }
}
