package com.company.projeto.parsers;

import com.company.enumeracao.Tipos;

public class TiposParsers {
    public static Tipos toTipos(String status){
        if(status.equals("gibis")) return Tipos.GIBI;
        if(status.equals("jornal")) return Tipos.JORNAL;
        if(status.equals("revista")) return Tipos.REVISTA;
        else return Tipos.VAZIO;
    }
}