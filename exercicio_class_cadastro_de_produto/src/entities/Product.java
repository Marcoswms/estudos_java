package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    /*Product: Este será o construtor, para que o objeto seja instanciado já recebendo valores
     em seus atributos.
     O construtor deverá ficar logo após os atributos declarados. */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /*Sobrecarga: Este segundo construtor é uma sobrecarga, trata-se do mesmo construtor porém sem
     o parâmetro 'quantity', para que ele receba um valor padrão = 0 ou seja, um construtor com o
     mesmo nome porém com listas de parâmetros diferentes uns dos outros*/
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

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
