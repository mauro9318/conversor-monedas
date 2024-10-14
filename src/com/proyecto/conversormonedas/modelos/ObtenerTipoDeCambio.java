package com.proyecto.conversormonedas.modelos;

public class ObtenerTipoDeCambio {
    String divisa;
    public double tipoCambioBolivianos(){
         return BuscarMoneda.posicion(LecturaDatos.getLista(),"BOB");
    }

    public double tipoCambioRealBrasilero(){
        return BuscarMoneda.posicion(LecturaDatos.getLista(),"BRL");
    }

    public double tipoCambioPesoArgentino(){
        return BuscarMoneda.posicion(LecturaDatos.getLista(),"ARS");
    }
}
