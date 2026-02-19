package Minterfaces.dominio;

// interface → contrato que define comportamentos obrigatórios
public interface DataLoader {

    // em interface, atributos são automaticamente public static final (constantes)
    public static final int MAX_DATA_SIZE = 10;

    // métodos em interface são automaticamente public abstract
    public abstract void Load();

    // default → método com implementação dentro da interface (conceito novo)
    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes.");
    }

    // método static dentro de interface (não é herdado pela classe que implementa)
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}

