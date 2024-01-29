package com.ebac.modulo38;

import com.ebac.modulo38.interfaces.FiguraService;
import com.ebac.modulo38.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Contexto {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ebac.modulo38");
        context.refresh();

        /*Service service = context.getBean(Service.class);
        System.out.println("Hashcode: del objeto service: " + service.hashCode());
        String byId = service.getById(6);
        System.out.println(byId);

        System.out.println("----------------------------");

        Service service2 = context.getBean(Service.class);
        System.out.println("Hashcode: del objeto service: " + service2.hashCode());
        String byId2 = service2.getById(6);
        System.out.println(byId2);*/

        FiguraService figuraService = context.getBean(FiguraService.class);
        figuraService.imprimirFigura1();
        figuraService.imprimirFigura2();
    }
}
