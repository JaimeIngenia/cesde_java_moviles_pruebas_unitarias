package com.example.turismoapp.modelos;

import com.example.turismoapp.validaciones.LocalValidacion;

public abstract class Local {

    //variables de la clase abstracta

    private final Integer costoMensual = 70000;
    private final Integer costoAnual = 1200000;
    private final Double IVA = 0.19;

    //getter y setter de la clase abstracta

    public Integer getCostoAnual() {
        return costoAnual;
    }

    public Integer getCostoMensual() {
        return costoMensual;
    }

    public Double getIVA(){
        return IVA;
    }

    public abstract Double calcularAnualidad();


//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private String nit;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private LocalValidacion validarObjetoLocal = new LocalValidacion();

//Constructor vacio
    public Local() {
    }

    //Constructor lleno
    public Local(Integer id, String nit, String nombre, String ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }
//GETTERS Y SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try
        {
            this.validarObjetoLocal.validarNit(nit);
            this.nit = nit;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try
        {
            this.validarObjetoLocal.validarNombreLocal(nombre);
            this.nombre = nombre;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", validarObjetoLocal=" + validarObjetoLocal +
                '}';
    }
}
