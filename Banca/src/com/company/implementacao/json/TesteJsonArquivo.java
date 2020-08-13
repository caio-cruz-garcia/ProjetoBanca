package com.company.implementacao.json;

import com.company.enumeracao.Tipos;
import com.company.projeto.model.Jornal;
import com.company.projeto.model.ListaDeJornais;
import com.company.projeto.parsers.BancaParser;
import com.company.projeto.parsers.JornalParser;
import org.json.JSONArray;

import java.io.*;

public class TesteJsonArquivo {
    public static void main(String[] args) {
//        ListaDeJornais lista = new ListaDeJornais();
//        lista.addJornal(new Jornal("AAA",10, Tipos.GIBI,1));
//        lista.addJornal(new Jornal("BBB",20,Tipos.JORNAL,1));
//        lista.addJornal(new Jornal("CCC",20,Tipos.REVISTA,2));
//
//        JSONArray json = BancaParser.toJson(lista);
//        escreverArquivo("jornais.json", json);

        //ListaDeJornais lista = BancaParser.fromJson(lerArquivo("jornais.json"));
        ListaDeJornais lista = BancaParser.fromJson(lerArquivo("arquivo_Json.txt"));
        System.out.println("Lista Carregada");
        System.out.println(lista.getMeusJornais().get(0).toString());

    }

    private static JSONArray lerArquivo(String nomeArquivo) {
        JSONArray json = null;
        File file = new File(nomeArquivo);
        try{
            //Cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);
            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            json = new JSONArray (bufferedReader.readLine());

            //Feche tudo ao terminar
            bufferedReader.close();
            fileReader.close();

        }catch (Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
        return json;
    }


    private static void escreverArquivo(String nomeArquivo, JSONArray json) {
        File file = new File(nomeArquivo);
        try{

            //Cria uma conexão apra escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("" + json);

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //fecha os demais fluxos
            fileWriter.close();

        }catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}
