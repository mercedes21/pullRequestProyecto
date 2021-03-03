package com.example.demo.CategoryDTO;

import lombok.Data;


@Data
public class CategoryDto {
    private int id;
    private String descripcion;
    private boolean state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getState() {

        return state;
    }

    public void setState(boolean state) {

        this.state = state;
    }




}
