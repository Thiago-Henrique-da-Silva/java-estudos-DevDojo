package Pcolecoes.test;

import Oexceptions.exception.dominio.LoginInvalidoException;
import Pcolecoes.dominio.SmartPhone;

import java.io.FileNotFoundException;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1", "iphone");
        SmartPhone s2 = new SmartPhone("1ABC2", "iphone");
        System.out.println(s1.equals(s2));
    }
}
