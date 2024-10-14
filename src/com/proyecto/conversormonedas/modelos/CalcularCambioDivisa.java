package com.proyecto.conversormonedas.modelos;

public class CalcularCambioDivisa {
    public static double conversion(double cantidad, double monedaEscogida){
        return cantidad * monedaEscogida;
    }

    public static double conversionDolar(double cantidad, double monedaEscogida){
        return cantidad/monedaEscogida;

    }
}
