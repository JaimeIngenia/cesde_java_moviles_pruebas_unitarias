package com.example.turismoapp.modelos;

import com.example.turismoapp.interfaces.Deduccion;
import com.example.turismoapp.interfaces.Notificaciones;
import com.example.turismoapp.interfaces.Reporte;
import com.example.turismoapp.validaciones.AgrupacionCulturalValidacion;

public class AgrupacionCultural extends Local implements Deduccion, Reporte, Notificaciones {

    //ATRIBUTOS

    AgrupacionCulturalValidacion objetoAgrupacionCulturalValidacion = new AgrupacionCulturalValidacion();
    private String descripcionActividad;

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        try
        {
            this.objetoAgrupacionCulturalValidacion.validarDescripcionActividad(descripcionActividad);
            this.descripcionActividad = descripcionActividad;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }


    }

//IMPLEMENTACION DE INTERFACES


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
    public Double calcularAnualidad() {

        Double calcular = (this.getCostoAnual() - (this.getCostoAnual()) *0.25);
        return calcular;

    }

    @Override
    public String postearNotificacionGlobal(String notificacion) {
        return notificacion;
    }
}
