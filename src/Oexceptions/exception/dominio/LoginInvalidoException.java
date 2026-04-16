package Oexceptions.exception.dominio;

//criando uma exceção customizada.
public class LoginInvalidoException extends Exception {

    //chama o construtor da Exception com mensagem padrão
    public LoginInvalidoException() {
        super("Login invalido");

    }

    //permite passar uma mensagem personalizada
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }

}
