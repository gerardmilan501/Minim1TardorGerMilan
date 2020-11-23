package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Alumno {

    String id;
    String nombre;
    int edad;
    String salud;
    static int lastId;

    public Alumno() {
        this.id = RandomUtils.getId();
    }

    public Alumno(String nombre, int edad, String salud) {
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSalud(salud);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Alumno [id="+id+", nombre=" + nombre + ", edad=" + edad +", salud=" + salud "]";
    }
}
