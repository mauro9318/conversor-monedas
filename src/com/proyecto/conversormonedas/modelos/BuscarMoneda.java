package com.proyecto.conversormonedas.modelos;

import java.util.List;

public class BuscarMoneda {

    public static double posicion(List<Moneda> lista, String codigo){
        for (int i = 0; i < lista.size(); i++) {
            Moneda moneda = lista.get(i);
            if (moneda.getCodigoMoneda().equals(codigo)) {
                return moneda.getValor();
            }
        }
        return 0;
    }
}
