package com.company.implementacao.json;

import com.company.enumeracao.Tipos;
import com.company.projeto.model.Jornal;
import com.company.projeto.parsers.JornalParser;
import org.json.JSONObject;

public class TesteJson {
    public static void main(String[] args) {
        Jornal jornal1 = new Jornal("Turma da monica", 20, Tipos.GIBI, 30);
        Jornal jornal2 = new Jornal("Jornal da tarde", 30, Tipos.JORNAL, 23);
        Jornal jornal3 = new Jornal("Playboy", 12, Tipos.REVISTA, 0);

        JSONObject json = JornalParser.toJson(jornal1);
        System.out.println("Formato JSON:" + json);

        JSONObject json2 = JornalParser.toJson(jornal2);
        System.out.println("Formato JSON:" + json2);

        JSONObject json3 = JornalParser.toJson(jornal3);
        System.out.println("Formato JSON:" + json3);

        Jornal jornal4 = JornalParser.fromJson(json);
        System.out.println("Jornal 1:" + jornal4);

        Jornal jornal5 = JornalParser.fromJson(json2);
        System.out.println("Jornal 2:" + jornal5);

        Jornal jornal6 = JornalParser.fromJson(json3);
        System.out.println("Jornal 3:" + jornal6);
    }
}
