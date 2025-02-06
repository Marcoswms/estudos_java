package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*O atributo 'quantidade' só pode ser alterada se houver uma entrada ou saída no estoque, por tanto para proteger
    o objeto 'produto' de alterações inconsistentes na quantidade do produto, utilizamos apenas 'getQuantity'*/
    public int getQuantity() {
        return quantity;
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
