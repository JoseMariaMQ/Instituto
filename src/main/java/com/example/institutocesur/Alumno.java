package com.example.institutocesur;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno {
    private int id;
    private String nombre;
    private String curso;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alumno{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", curso='").append(curso).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
