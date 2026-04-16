package Oexceptions.exception.test;

import Oexceptions.exception.dominio.Funcionario;
import Oexceptions.exception.dominio.LoginInvalidoException;
import Oexceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //referência do tipo pai
        Funcionario funcionario = new Funcionario(); // objeto filho

        try {
            // chamando metodo que pode lançar exceções
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            //tratando multiplas exceções
            e.printStackTrace();
        }
    }
}

