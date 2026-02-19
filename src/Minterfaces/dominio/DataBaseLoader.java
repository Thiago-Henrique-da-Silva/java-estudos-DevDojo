package Minterfaces.dominio;

// classe implementando múltiplas interfaces
public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void Load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissoes.");
    }

    @Override
    public void Remove() {
        System.out.println("removendo dados do banco de dados...");
    }

    // método static em classe concreta (não pertence à interface)
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}

