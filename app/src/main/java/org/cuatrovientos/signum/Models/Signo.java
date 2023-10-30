package org.cuatrovientos.signum.Models;

import org.cuatrovientos.signum.app.MyAplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Signo extends RealmObject {
    @PrimaryKey
    private int id;
    private String titulo;

    private int imagen;

    private int categoriaId ;


    public Signo(String titulo, int imagen, int categoriaId) {
        this.id = MyAplication.signosId.incrementAndGet();
        this.titulo = titulo;
        this.imagen = imagen;
        this.categoriaId = categoriaId ;

    }



    // Getters y setters
    public int getCategoriaId() {
        return categoriaId;
    }

    // Setter
    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
