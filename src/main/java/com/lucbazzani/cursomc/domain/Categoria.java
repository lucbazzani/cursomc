package com.lucbazzani.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

    private Integer id;
    private String name;

    public Categoria() {
    }

    public Categoria(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return getId().equals(categoria.getId()) && getName().equals(categoria.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}