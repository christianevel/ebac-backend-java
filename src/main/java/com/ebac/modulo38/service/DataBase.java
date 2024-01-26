package com.ebac.modulo38.service;

import org.springframework.beans.factory.annotation.Value;

public class DataBase {

    @Value("${db.dev.url}")
    String dbUrl;

    @Value("root")
    String user;

    @Value("${VARIABLE_AMBIENTE}")
    String variableAmbiente;

    public String getById(int id) {
        System.out.println("Url hacia la base de datos: " + dbUrl);
        System.out.println("Usuario por default: " + user);
        System.out.println(variableAmbiente);
        return "Id de la base de datos: " + id;
    }
}
