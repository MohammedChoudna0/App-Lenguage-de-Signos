package org.cuatrovientos.signum.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Signo extends RealmObject {
    @PrimaryKey
    private int id;
    private String titulo;

    private String imagen;

    private int categoriaId ;

    public Signo(int id, String titulo, String imagen, String pk) {
        this.id = id;
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


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


}
