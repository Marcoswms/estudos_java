package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValuenStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        //'this' acessa diretamente o ATRIBUTO da classe e não o parâmetro da função.
        this.quantity += quantity;
        //Soma-se o valor do atributo + o valor que virá no parâmetro quando chamada a função.
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    /*toString: É um método já pertencente a classe 'Object' e por padrão, a classe 'Product' será pertencente
    a classe 'Object'. Neste caso estamos 'sobrescrevendo' este método para que tenha o comportamento que
     melhor nos atente neste exemplo. */
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price) //Formatação de casa decimal.
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValuenStock());
    }
}
