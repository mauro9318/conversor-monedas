package com.proyecto.conversormonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LecturaDatos {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static List<Moneda> lista = new ArrayList<>();

    public static List<Moneda> getLista() {
        return lista;
    }

    public void guardarDatos (String datos){
        DatosMoneda datosMoneda = gson.fromJson(datos, DatosMoneda.class);
        Map<String, Double> tasasDeCambio = datosMoneda.conversion_rates();

        for(Map.Entry<String, Double> entrada : tasasDeCambio.entrySet()){
            String codigoMoneda = entrada.getKey();
            double tasaConversion = entrada.getValue();
            Moneda moneda = new Moneda(codigoMoneda, tasaConversion);
            lista.add(moneda);
        }
    }
}
