package com.ebac.modulo37;

import com.ebac.modulo37.componentes.ClaseServicioPorAnotacion;
import com.ebac.modulo37.componentes.ClaseServicioPorConstructor;
import com.ebac.modulo37.componentes.ClaseServicioPorSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Contexto {

    public static void main(String[] args) {
        // Cargar el archivo applicationContext.xml para inicializar el ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Obtener el bean configurado a través del ApplicationContext
        //ClaseServicioPorSetter miBeanPorSetter = (ClaseServicioPorSetter) context.getBean("claseServicioBean");

        //ClaseServicioPorConstructor miBeanPorConstructor = (ClaseServicioPorConstructor) context.getBean("claseServicioBeanPorConstructor");

        ClaseServicioPorAnotacion miBeanPorAnotacion = (ClaseServicioPorAnotacion) context.getBean("claseServicioBeanPorAnotacion");

        // Usar el bean y realizar operaciones
        miBeanPorAnotacion.realizarOperacion();
    }
}