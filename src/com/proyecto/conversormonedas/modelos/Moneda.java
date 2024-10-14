package com.proyecto.conversormonedas.modelos;

public class Moneda {
    private String codigoMoneda;
    private double valor;

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Moneda(String codigoMoneda, double tasaConversion){
        this.codigoMoneda = codigoMoneda;
        this.valor = tasaConversion;

    }

    @Override
    public String toString() {
        return "La moneda es "+codigoMoneda+ " y su valor es "+valor;
    }
}
