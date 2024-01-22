package com.ebac.modulo35;

import com.ebac.modulo35.dto.Direccion;
import com.ebac.modulo35.model.DireccionModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Contexto {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("coneccionLocalMySQL");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        DireccionModel direccionModel = new DireccionModel(entityManager);

        /*
        // Crear direccion
        Direccion direccion1 = new Direccion();
        direccion1.setIdUsuario(1);
        direccion1.setCalle("Cinco");
        direccion1.setNumero(123);
        direccion1.setEstado("SLP");
        direccionModel.guardar(direccion1);

        // Obtener direccion
        Direccion direccion = direccionModel.obtenerPorId(1);
        System.out.println("Direccion 1: " + direccion);

        // Actualizar direccion
        direccion.setEstado("Monterrey");
        direccionModel.actualizar(direccion);

        Direccion direccionActualizada = direccionModel.obtenerPorId(1);
        System.out.println("Direccion1 actualizada: " + direccionActualizada);
        */

        /*Direccion direccion = direccionModel.obtenerPorId(1);

        direccionModel.eliminar(direccion);
        direccion = direccionModel.obtenerPorId(1);
        System.out.println("Direccion1: " + direccion);*/

        crearDirecciones(10, direccionModel);

        // Cerrar la conexion
        entityManager.close();
        entityManagerFactory.close();
    }

    private static void crearDirecciones(int num, DireccionModel direccionModel) {
        Direccion direccion;
        for (int i = 0; i < num; i++) {
            direccion = new Direccion();
            direccion.setIdUsuario(1 + i);
            direccion.setCalle("Calle-" + i);
            direccion.setNumero(1 + i);
            direccion.setEstado("Estado-" + i);

            direccionModel.guardar(direccion);
        }
    }
}