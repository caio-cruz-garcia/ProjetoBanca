package com.company.projeto.parsers;

import com.company.projeto.model.ListaDeJornais;
import org.json.JSONArray;
import org.json.JSONObject;

public class BancaParser {
    public static JSONArray toJson(ListaDeJornais lista){
        JSONArray json = new JSONArray();
        lista.getMeusJornais().forEach( jornal -> {
            json.put(JornalParser.toJson(jornal));
        });
        return json;
    }

    public static ListaDeJornais fromJson(JSONArray json){
        ListaDeJornais lista = new ListaDeJornais();
        json.forEach( item -> {
            lista.addJornal(JornalParser.fromJson((JSONObject) item));
        });
        return lista;
    }

}

