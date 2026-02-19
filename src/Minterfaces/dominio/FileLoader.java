package Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void Load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    @Override
    public void Remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    @Override
    public void checkPermission() {

        // InterfaceName.super.metodo() → chama implementação default específica da interface
        DataLoader.super.checkPermission();
    }
}

