package com.desafio.desafio.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {


    public double shippingService(double valorPedido) {
        double frete = 0;
        if (valorPedido < 100) {
            frete = 20;
        } else if (valorPedido > 100  && valorPedido < 200) {
            frete = 12;
        }else if (valorPedido > 200) {
            frete = 0 ;
        }
        return frete;
    }
}
