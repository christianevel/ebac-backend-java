package com.ebac.modulo38.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("circulo")
public class Circulo implements Figura{
    @Override
    public void nombre() {
        System.out.println("Circulo");
    }
}
