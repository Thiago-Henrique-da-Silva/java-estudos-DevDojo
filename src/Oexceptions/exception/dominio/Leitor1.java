package Oexceptions.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

//implements Closeable permite fechamento  automatico

public class Leitor1 implements Closeable {

    @Override
    public void close() throws IOException {
        // Java chama automaticamente ao sair do try-with-resources
        System.out.println("fechando leitor 1");
    }
}
