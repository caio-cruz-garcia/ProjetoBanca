package com.company.projeto.parsers;

import com.company.projeto.model.Jornal;
import org.json.JSONObject;


public class JornalParser {

    public static JSONObject toJson(Jornal jornal){
            JSONObject json = new JSONObject();
            json.put("nome", jornal.getNome());
            json.put("preco", jornal.getPreco());
            json.put("tipos", jornal.getTipos());
            json.put("quantidade", jornal.getQuantidade());
            return json;
        }

        public static Jornal fromJson(JSONObject json){
            Jornal jornal = new Jornal(
                    json.getString("nome"),
                    json.getInt("preco"),
                    TiposParsers.toTipos(json.getString("tipos")),
                    json.getInt("quantidade")
            );
            return jornal;
        }
}

