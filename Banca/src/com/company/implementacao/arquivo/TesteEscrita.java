package com.company.implementacao.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TesteEscrita {
    public static void main(String[] args) {
        File file = new File("nome.txt");

        try{

            //Cria uma conexão para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria uma buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("Ola Mundo arquivos!\n");
            bufferedWriter.write("lala 2+2=" + (2+2) + "\n");
            bufferedWriter.write("Vegeta é o Cara!\n");

            //Força escrita na hora
            //bufferedWriter.flush();

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();

            //Fecha os demais fluxos
            fileWriter.close();

        }catch (Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}

