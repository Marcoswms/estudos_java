/* Exercício:
  .Ler os dados de um pedido com N itens (N fornecido pelo usuário).
  .Mostrar o sumário do pedido. O instante do pedido deverá ser o instante do sistema: new Date() */
package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SumarioProgram {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        List allOrders = new ArrayList();
        Order order = null;
        int count = 0;

        while (count < 2) {
            System.out.println("Enter cliente data");
            System.out.println("Name:");
            String name = scan.nextLine();
            System.out.println("Email:");
            String email = scan.nextLine();
            System.out.println("Birth date (DD/MM/YYYY):");
            Date birthDate = sdf.parse(scan.next());//Converte o que for inserido no scan para Date

            System.out.println("Enter order data");
            System.out.println("Status:");
            OrderStatus status = OrderStatus.valueOf(scan.next());//Converte o que for inserido no scan para Enum
            System.out.println("How many items to this order?");
            int qtdOrder = scan.nextInt();

            Client client = new Client(name, email, birthDate);
            order = new Order(new Date(), status, client);

            for (int index = 0; index < qtdOrder; index++) {
                scan.nextLine();
                System.out.println("Enter #" + (index + 1) + " item data");
                System.out.println("Product name:");
                String nameItem = scan.nextLine();
                System.out.println("Product price:");
                Double priceItem = scan.nextDouble();
                scan.nextLine();
                System.out.println("Quantity:");
                Integer qtdItem = scan.nextInt();

                Product product = new Product(nameItem, priceItem);
                OrderItem orderItem = new OrderItem(qtdItem, priceItem, product);
                order.addItem(orderItem);
            }
            scan.nextLine();
            allOrders.add(order);
            count++;
        }
        scan.close();
        for(Object list : allOrders) {
            System.out.println(list);
        }
    }
}