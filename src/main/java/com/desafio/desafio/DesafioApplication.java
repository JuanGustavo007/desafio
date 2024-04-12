package com.desafio.desafio;

import com.desafio.desafio.domain.Order;
import com.desafio.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;


    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.0D, 20.00);
        System.out.println("Pedido código "  + order.getCode());
        System.out.printf("%.2f", orderService.service(order));
    }
}
