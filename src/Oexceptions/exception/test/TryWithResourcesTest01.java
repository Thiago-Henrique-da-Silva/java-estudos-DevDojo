package Oexceptions.exception.test;

import Oexceptions.exception.dominio.Leitor1;
import Oexceptions.exception.dominio.Leitor2;

import java.io.*;



public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }


    // O Java verifica se o objeto implementa AutoCloseable/Closeable
    // Se tiver o método close(), ele garante que será chamado automaticamente ao final do try

    public static void lerArquivo() {
        // cria recursos que serão fechados automaticamente
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null; // 👻 ainda não tem recurso
        try {
            // tentando abrir arquivo
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            // erro ao abrir arquivo → vai direto pro catch
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    // fecha recurso manualmente
                    reader.close();
                }
            } catch (IOException exception) {
                // erro ao fechar recurso
                exception.printStackTrace();
            }
        }
    }
}
