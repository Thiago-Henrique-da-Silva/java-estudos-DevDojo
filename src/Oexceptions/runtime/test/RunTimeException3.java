package Oexceptions.runtime.test;

public class RunTimeException3 {
    public static void main(String[] args) {
        abreConexao();
    }
        private static String abreConexao() {

            try {
                System.out.println("abrindo arquivo");
                System.out.println("escrevendo dados no arquivo");
                // Retorna sucesso, mas o finally ainda será executado antes de sair do método
                return "conexão aberta";
            } catch (Exception e) {
                e.printStackTrace();
                // Sempre executa, com erro ou sem erro (ideal para fechar recursos)
            } finally {
                System.out.println("fechando recurso liberaado pelo SO");
            }
            return null;
        }

    private static void abreConexao2() {

        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso liberaado pelo SO");
        }
    }
}


