package org.cuatrovientos.signum.Models;

import org.cuatrovientos.signum.App.MyAplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Categoria extends RealmObject {
    @PrimaryKey
    private int id;
    private String nombre;
    private int imagen;

    // Constructor
    public Categoria(String nombre, int imagen) {
        this.id = MyAplication.categoriasId.incrementAndGet();
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
