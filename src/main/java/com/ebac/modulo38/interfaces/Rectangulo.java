package com.ebac.modulo38.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rectangulo")
public class Rectangulo implements Figura{
    @Override
    public void nombre() {
        System.out.println("Rectangulo");
    }
}
