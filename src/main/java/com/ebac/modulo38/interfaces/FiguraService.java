package com.ebac.modulo38.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FiguraService {

    @Autowired
    Figura circulo;

    @Autowired
    Figura rectangulo;

    public void imprimirFigura1() {
        circulo.nombre();
    }

    public void imprimirFigura2() {
        rectangulo.nombre();
    }
}
