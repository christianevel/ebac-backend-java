package com.ebac.modulo36.model;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import java.util.Objects;
import java.util.Optional;

public class DireccionModel {

    private final MongoCollection<Document> collection;

    public DireccionModel(MongoDatabase database) {
        collection = database.getCollection("direcciones");
    }

    public void guardar(Document document) {
        collection.insertOne(document);
    }

    public void obtener() {
        FindIterable<Document> direcciones = collection.find();

        for (Document direccion : direcciones) {
            System.out.println(direccion);
        }
    }

    public Optional<Document> obtenerPorId(Document document) {
        Document direccion = collection.find().first();

        if (!Objects.isNull(direccion)) {
            System.out.println(direccion);
            return Optional.of(direccion);
        }

        return Optional.empty();
    }

    public void actualizar(Document documentoActual, Document documentoNuevo) {
        UpdateResult updateResult = collection.updateOne(documentoActual, documentoNuevo);

        if (updateResult.getModifiedCount() > 0) {
            System.out.println("Direccion actualizada con exito");
        } else {
            System.out.println("La direccion no fue encontrada");
        }
    }

    public void eliminar(Document document) {
        DeleteResult deleteResult = collection.deleteOne(document);

        if (deleteResult.getDeletedCount() > 0) {
            System.out.println("Direccion eliminada con exito");
        } else {
            System.out.println("La direccion no fue encontrada");
        }
    }
}
