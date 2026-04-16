package Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

//NUNCA DEIXAR O CATCH VAZIO,DICA PARA PROFISSIONALISMO.
//"File file" --> Representa um arquivo ou diretório no sistema operacional (não cria ainda, só referencia)
//"try" --> Tenta executar um código que pode gerar erro (exceção)
//"boolean isCriado = file.createNewFile();" --> Tenta criar o arquivo fisicamente no sistema e retorna true se criou.
//"catch" --> Captura o erro caso aconteça algum problema na criação do arquivo.
//"e.printStackTrace();" --> Mostra detalhes do erro no console (ajuda a identificar o problema)

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File ("arquivo\\test.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado: " + isCriado);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
