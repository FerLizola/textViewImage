package com.tutorialesprogramacionya.proyecto052;

/**
 * Created by diego on 16/10/2016.
 */

public class Persona {
    private String nombre;
    private String carrera,nocontrol;

    public Persona(String nombre, String carrera,String nocontrol) {
        this.nombre=nombre;
        this.carrera=carrera;
        this.nocontrol=nocontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getNocontrol(){return nocontrol;}

}