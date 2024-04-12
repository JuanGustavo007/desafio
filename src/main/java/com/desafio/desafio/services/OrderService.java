package com.desafio.desafio.services;


import com.desafio.desafio.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double service(Order order) {
        return (order.getBasico() + shippingService.shippingService(order.getBasico()) - (order.getBasico() * (order.getDesconto() / 100)));
    }
}
