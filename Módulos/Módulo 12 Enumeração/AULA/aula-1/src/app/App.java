package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime timer = LocalDateTime.now();
        Order pedido = new Order(01, timer, OrderStatus.PENDING_PAYMENT);
        System.out.println(pedido);
    }
}
