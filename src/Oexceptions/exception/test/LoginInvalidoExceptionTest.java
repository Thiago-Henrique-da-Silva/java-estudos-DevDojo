package Oexceptions.exception.test;

import Oexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            //tentando executar o login
            logar();
        } catch (LoginInvalidoException ex) {
            //capturou o erro de login invalido
            ex.printStackTrace();
        }
    }
    public static void logar() throws LoginInvalidoException {
        Scanner Teclado = new Scanner(System.in);
        String  usernameDB = "Goku";
        String  passwordDB = "ssj";
        System.out.println("usuario");
        String usernameDigitado = Teclado.nextLine();
        System.out.println("senha");
        String passwordDigitado = Teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw  new LoginInvalidoException("usuario ou senha invalido");
        }

        System.out.println("Login realizado com sucesso");
    }
}
