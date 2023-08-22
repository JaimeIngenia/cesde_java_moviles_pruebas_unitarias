package com.example.turismoapp.modelos;

import com.example.turismoapp.interfaces.Deduccion;
import com.example.turismoapp.interfaces.Notificaciones;
import com.example.turismoapp.interfaces.Reporte;
import com.example.turismoapp.validaciones.LocalValidacion;

public class EmpresaPrivada extends Local implements Deduccion, Reporte, Notificaciones {

    //ATRIBUTOS



    private String nombreRepresentanteLegal;
    private LocalValidacion validarObjetoLocal = new LocalValidacion();

    //METODOS

    @Override
    public Double calcularAnualidad() {
        Double calcular = this.getCostoAnual() + 0.0;
        return calcular;
    }

    public EmpresaPrivada() {
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, String ubicacion, String descripcion, String nombreRepresentanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);

        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    //GETTERS Y SETTERS



    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        try{
            this.validarObjetoLocal.validarNombreRepresentanteLegal(nombreRepresentanteLegal);
            this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }


    //IMPLEMENTACION INTERFACES


    @Override
    public void calcularDeduccionMensualidad() {

    }

    @Override
    public Double calcularDescuentoMensualidad(Double pago) {
        return null;
    }


    @Override
    public void generarReporte(Integer id) {

    }

    @Override
    public String postearNotificacionGlobal(String notificacion) {
        return notificacion;
    }
}
