package com.ebac.modulo37.componentes;

public class ClaseServicioPorSetter {

    private ClaseModelo claseModelo;

    public void realizarOperacion() {
        claseModelo.conectar();
        System.out.println("Realizando operación con inyección por Setter");
    }

    public void setClaseModelo(ClaseModelo claseModelo) {
        this.claseModelo = claseModelo;
    }
}