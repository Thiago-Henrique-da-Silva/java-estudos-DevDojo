package Pcolecoes.dominio;

/* O hashCode() transforma o objeto em um número inteiro, esse número é usado
     como "endereço" para guardar e localizar o objeto rapidamente em collections como HashMap e HashSet,
     sem precisar percorrer tudo. */

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;          // se o objeto comparado for nulo, não pode ser igual
        if (this == obj) return true;           // se for a mesma referência de memória, é o mesmo objeto
        if (this.getClass() != obj.getClass()) return false;  // se forem classes diferentes, não podem ser iguais
        SmartPhone smartPhone = (SmartPhone) obj;             // faz o cast para acessar os campos do objeto
        return this.serialNumber.equals(smartPhone.serialNumber); // compara pelo serialNumber, que é o critério de igualdade
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode(); // se serialNumber for nulo retorna 0, senão gera um número baseado no valor do serialNumber
        // isso garante que objetos iguais pelo equals tenham o mesmo hashCode.
        // o que é obrigatório para funcionar corretamente em collections como HashMap e HashSet
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
