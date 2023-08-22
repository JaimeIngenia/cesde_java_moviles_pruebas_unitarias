package com.example.turismoapp.modelos;

import com.example.turismoapp.interfaces.Deduccion;
import com.example.turismoapp.interfaces.Reporte;

public class NegocioParticular extends Local implements Deduccion, Reporte {
    @Override
    public void calcularDeduccionMensualidad() {
        Double calcular = this.getCostoMensual() + 0.0;
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
        Double calcular = this.getCostoAnual() + 0.0;
        return calcular;
    }
}
