package Oexceptions.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
        System.out.println("codigo finalizado.");
    }

    private static int divisao(int a, int b){
        if (b == 0) {
            // Lança uma exceção manualmente para impedir a execução inválida
            throw new IllegalArgumentException("argumento ilegal,não pode ser zero");
        }

        return a / b;
    }
}
