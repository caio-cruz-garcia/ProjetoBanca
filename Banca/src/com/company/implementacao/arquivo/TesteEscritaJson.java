package com.company.implementacao.arquivo;

import com.company.enumeracao.Tipos;
import com.company.projeto.model.Jornal;
import com.company.projeto.model.ListaDeJornais;
import com.company.projeto.parsers.BancaParser;
import com.company.projeto.parsers.JornalParser;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TesteEscritaJson {
    public static void main(String[] args) {
        File file = new File("arquivo_Json.txt");

        try {

            //Cria uma conexão para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria uma buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Exemplo jornais
            Jornal jornal1 = new Jornal("Turma da monica", 20, Tipos.GIBI, 30);
            Jornal jornal2 = new Jornal("Jornal da tarde", 30, Tipos.JORNAL, 23);
            Jornal jornal3 = new Jornal("Playboy", 12, Tipos.REVISTA, 0);

            //Adiciona jornais na lista
            ListaDeJornais lista = new ListaDeJornais();
            lista.addJornal(jornal1);
            lista.addJornal(jornal2);
            lista.addJornal(jornal3);

            //Parse para json
            JSONArray json = BancaParser.toJson(lista);

            //Escreve no arquivo
            bufferedWriter.write(json.toString());

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();

            //Fecha os demais fluxos
            fileWriter.close();

        } catch (Exception exception) {
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}
