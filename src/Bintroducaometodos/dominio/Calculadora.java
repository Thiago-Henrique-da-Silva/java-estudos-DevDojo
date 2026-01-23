package Bintroducaometodos.dominio;

public class Calculadora {

    //calculadoraTest01
    //"void" faz com que nao retorna nada,apenas dá saida.
    public void somaDoisNumeros() {

        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {

        System.out.println(15 - 10);
    }

    //calculadoraTest02
    public void multiplicaDoisNumeros(int num1 ,double num2) {

        System.out.println(num1 * num2);
    }

    //calculadoraTest01
    //public com retorno.
    public double divideDoisNumeros(double num1,double num2) {
        if (num2 == 0) {

            return 0;
        }

        return num1 / num2;

    }
        //forma diferente
        public double divideDoisNumeros02( double num1 , double num2) {
            if (num2 != 0) {
                return num1 / num2;
            }
            return 0;
        }

        //forma diferente
        public void imprimeDivisaoDeDoisNumeros(double num1 , double num2){
            if (num2 == 0) {
                System.out.println("não existe divisao por zero.");
                return;

            }
            System.out.println(num1 / num2);
        }

        //calculadoraaTest04
        public void alteraDoisNumeros(int num1 , int num2 ){

            num1 = 99;
            num2 = 33;
            System.out.println("dentro do alteraDoisNumeros:");
            System.out.println("num1: "+num1);
            System.out.println("num2: "+num2);
        }

        //calculadoraTest05
        public void somaArray(int[] numeros){

            int soma = 0;
            for (int numero:numeros) {
                soma += numero;
            }
            System.out.println(soma);
        }

        //calculadoraTest05
        public void somaVarArgs(int... numeros){

            int soma = 0;
            for (int numero:numeros) {
                soma += numero;
            }
            System.out.println(soma);
        }
        
    
}
