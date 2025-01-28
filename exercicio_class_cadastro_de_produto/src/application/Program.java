package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scan.nextLine();//Armazenará dentro do objeto 'product', no atributo 'name'.
        System.out.println("Price: ");
        product.price = scan.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = scan.nextInt();

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
