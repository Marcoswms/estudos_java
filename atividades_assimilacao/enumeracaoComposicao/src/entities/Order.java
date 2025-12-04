package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();//Não se coloca coleção em construtor

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public Double total() {
        double total = 0.0;
        for (OrderItem item : orderItems) {
            total += item.subTotal();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order itens:\n");
        for (OrderItem item : orderItems) {
            sb.append(item.getProduct().getName() + ", Price: $"
                    + String.format("%.2f", item.getPrice()) + " Quantity: "
                    + item.getQuantity() + ", Subtotal: $"
                    + String.format("%.2f", item.subTotal()) + "\n");
        }
        sb.append("Total price: " + String.format("%.2f", total()) + "\n");
        return sb.toString();
    }
}