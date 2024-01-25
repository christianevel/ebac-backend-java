package com.ebac.modulo37.componentes;

import org.springframework.beans.factory.annotation.Autowired;

public class ClaseServicioPorAnotacion {

    @Autowired
    ClaseModelo claseModelo;

    public void realizarOperacion() {
        claseModelo.conectar();
        System.out.println("Realizando operación con inyección por Anotación");
    }
}