package com.desafio.desafio.domain;

public class Order {

    private int code;
    private Double basico;
    private Double desconto;

    public Order(int code, Double basico, Double desconto) {
        this.code = code;
        this.basico = basico;
        this.desconto = desconto;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getBasico() {
        return basico;
    }

    public void setBasico(Double basico) {
        this.basico = basico;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
