package com.ebac.modulo36;

import com.ebac.modulo36.model.DireccionModel;
import com.ebac.modulo36.model.UsuarioModel;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Optional;

public class Contexto {

    public static void main(String[] args) {
        String connectionString = "mongodb://root:toor@localhost:27017";
        MongoClient mongoClient = MongoClients.create(connectionString);
        MongoDatabase database = mongoClient.getDatabase("modulo36");

        DireccionModel direccionModel = new DireccionModel(database);

        // Crear una direccion
        /*Document document = new Document("idUsuario", 2)
                .append("calle", "prolongacion")
                .append("numero", 456)
                .append("estado", "Monterrey")
                .append("pais", "Mexico");
        direccionModel.guardar(document);*/

        // Listar direcciones
        // direccionModel.obtener();

        // Listar direccion por id
        ObjectId objectId = new ObjectId("65b02acfede4ef2871e0607e");
        Document documentoABuscar = new Document("_id", objectId);
        Optional<Document> direccionEncontrada = direccionModel.obtenerPorId(documentoABuscar);

        // Actualizar direccion
        /*direccionEncontrada.ifPresent(direccionActual -> {
            Document document = new Document("estado", "California").append("pais", "Estados Unidos");
            Document direccionActualizada = new Document("$set", document);

            direccionModel.actualizar(direccionActual, direccionActualizada);
        });
        direccionModel.obtener();*/

        // Eliminar direccion
        direccionModel.obtener();
        direccionEncontrada.ifPresent(direccionModel::eliminar);
        direccionModel.obtener();
    }
}
