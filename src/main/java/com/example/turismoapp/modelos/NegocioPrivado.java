package com.example.turismoapp.modelos;

import com.example.turismoapp.interfaces.Deduccion;
import com.example.turismoapp.interfaces.Reporte;
import com.example.turismoapp.validaciones.NegocioPrivadoValidacion;

public class NegocioPrivado  extends Local implements Deduccion, Reporte {
    NegocioPrivadoValidacion objetoNegocioPrivadoValidacion = new NegocioPrivadoValidacion();

    private String nombreRepresentanteLegal;


    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {

        try
        {
            this.objetoNegocioPrivadoValidacion.nombreRepresentanteLegal(nombreRepresentanteLegal);
            this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        }
        catch (Exception dilbani)
        {
            System.out.println(dilbani.getMessage());
        }

    }

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
        return null;
    }
}
