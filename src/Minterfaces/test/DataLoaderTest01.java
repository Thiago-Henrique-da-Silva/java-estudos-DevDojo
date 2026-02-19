package Minterfaces.test;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.DataLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.Load();
        dataBaseLoader.Load();

        dataBaseLoader.Remove();
        fileLoader.Remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        // chamada de método static da classe (não precisa de objeto)
        DataBaseLoader.retrieveMaxDataSize();

        // chamada de método static da interface (acesso direto pela interface)
        DataLoader.retrieveMaxDataSize();
    }
}

