package Oexceptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/* Lança manualmente uma exceção de índice fora do limite
throw new ArrayIndexOutOfBoundsException(); */

/* Captura exatamente esse tipo de exceção (mais específico)
catch (ArrayIndexOutOfBoundsException e) */

public class runtimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new  ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("dentro do RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private  static void  talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
