package Oexceptions.exception.dominio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pessoa {

    // método declara que pode lançar essas exceções
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando pessoa");
    }
}
