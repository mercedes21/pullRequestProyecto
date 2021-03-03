package com.example.demo.Entityes;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name = "CATEGORIAS")
public class Category {

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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private boolean state;

}
