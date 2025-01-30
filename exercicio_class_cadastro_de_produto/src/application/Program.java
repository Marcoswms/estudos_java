package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = scan.nextLine();/*Variável local: Serve para armazenar um dado temporariamente e transmitir
        seu dado a um parâmetro. Neste caso, 'name', 'price' e 'quantity' são variáveis locais*/
        System.out.println("Price: ");
        double price = scan.nextDouble();


        /*Após o 'new' será chamado o construtor 'Product' e adicionado as variáveis temporárias, para que
        os parâmetros do construtor receba estes valores e eles encaminhandos para os atributos do objeto instanciado
        PS: É uma boa prática instanciar o objeto desta forma para não correr o risco de instanciar com valores nulos. */
        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " + product.toString());
        /*Chamar o toString neste caso será opcional, o java entenderá
        que o objeto está no contexto de uma string através do 'println' (Optei por usar para praticar)*/

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt(); //Este valor será passado para o parâmetro do método 'addProducts'
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = scan.nextInt(); //Este valor será passado para o parâmetro do método 'removeProducts'
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product.toString());

        scan.close();
    }
}
