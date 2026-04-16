package Oexceptions.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    // sobrescrevendo método da classe pai
    // pode lançar as MESMAS exceções ou MENOS, mas nunca mais
    public void salvar() throws  LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando funcionario.");
    }


}
