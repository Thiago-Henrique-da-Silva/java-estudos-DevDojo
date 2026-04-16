package Oexceptions.dominio.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    //"error" é algo que acontece na JVM que provavelmtente não pode recuperar em tempo de execução.
    public static void recursividade(){
        recursividade();
    }
}
