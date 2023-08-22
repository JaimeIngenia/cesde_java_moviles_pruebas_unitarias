package com.example.turismoapp.modelos;

import com.example.turismoapp.interfaces.Deduccion;
import com.example.turismoapp.interfaces.Notificaciones;
import com.example.turismoapp.interfaces.Reporte;
import com.example.turismoapp.validaciones.NoAfiliadoValidacion;

import java.security.PublicKey;

public class NoAfiliado extends Usuario implements Deduccion, Reporte, Notificaciones {

    //ATRIBUTOS
    private Integer NumeroReservasMensuales;

    private NoAfiliadoValidacion objetoNoAfiliadoValidacion = new NoAfiliadoValidacion();

    //METODOS

    public NoAfiliado() {
    }

    //motodo de la super clase
    @Override
    public Double calcularAnualidad() {
        //Double calcular = this.getCostoAnual() + this.getIVA();
        Double calcular = this.getCostoAnual() + 0.0;
        return calcular;
    }

    public NoAfiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer numeroReservasMensuales) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        NumeroReservasMensuales = numeroReservasMensuales;
    }

    //GETTERS Y SETTERS

    public Integer getNumeroReservasMensuales() {
        return NumeroReservasMensuales;
    }

    public void setNumeroReservasMensuales(Integer numeroReservasMensuales) {

        try{
            this.objetoNoAfiliadoValidacion.validarNumeroReservasMensuales(numeroReservasMensuales);
            NumeroReservasMensuales = numeroReservasMensuales;
        }
        catch ( Exception error )
        {
            System.out.println(error.getMessage());
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
    public String postearNotificacionGlobal(String notificacion) {
        return notificacion;
    }

    //METODOS ORDINARIOS


}
