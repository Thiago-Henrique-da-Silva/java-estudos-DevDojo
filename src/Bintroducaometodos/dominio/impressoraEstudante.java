package Bintroducaometodos.dominio;

public class impressoraEstudante { // Classe responsável por imprimir dados de um estudante
    // Método que recebe um objeto Estudante e exibe seus atributos
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}


