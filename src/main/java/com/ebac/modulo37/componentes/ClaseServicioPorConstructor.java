package com.ebac.modulo37.componentes;

public class ClaseServicioPorConstructor {
    private final ClaseModelo claseModelo;

    public ClaseServicioPorConstructor(ClaseModelo claseModelo) {
        this.claseModelo = claseModelo;
    }

    public void realizarOperacion() {
        claseModelo.conectar();
        System.out.println("Realizando operación con inyección por Constructor");
    }
}