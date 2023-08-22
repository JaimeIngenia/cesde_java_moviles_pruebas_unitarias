package com.example.turismoapp.modelos;


import com.example.turismoapp.interfaces.Deduccion;
import com.example.turismoapp.interfaces.Notificaciones;
import com.example.turismoapp.interfaces.Reporte;
import com.example.turismoapp.validaciones.AfiliadoValidacion;

public class Afiliado extends Usuario implements Deduccion, Reporte , Notificaciones {

    //ATRIBUTOS

    private Integer valorMembresia;

    private String documentoReferido;
    private final Double IVA = 0.19; //Constante inicializada
    private AfiliadoValidacion objetoAfiliadoValidacion = new AfiliadoValidacion();

    //METODOS

    public Afiliado() {
    }
    //metodo de la super clase por el bombillo
    @Override
    public Double calcularAnualidad() {
        Double calcular = this.getCostoAnual() - (this.getCostoAnual()*0.2);
        return calcular;
    }

    public Afiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer valorMembresia, String documentoReferido) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorMembresia = valorMembresia;
        this.documentoReferido = documentoReferido;
    }

    //GETTERS Y SETTERS

    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        try
        {
            this.objetoAfiliadoValidacion.validarDocumentoReferido(documentoReferido);
            this.documentoReferido = documentoReferido;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    @Override
    public Double getIVA() {
        return IVA;
    }

    //METODOS ORDINARIOS

    public Double aplicarIva(){
        Double valorIva = this.IVA * this.valorMembresia;
        Double valorFinalMembresia = this.valorMembresia + valorIva;
        return valorFinalMembresia;
    }

    @Override
    public void calcularDeduccionMensualidad() {

    }

    @Override
    public Double calcularDescuentoMensualidad( Double pago) {
        try
        {
            this.objetoAfiliadoValidacion.validarDescuentoMensualidad(pago);
            return pago;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
            return null;
        }

    }

    @Override
    public void generarReporte(Integer id) {

    }

    @Override
    public String postearNotificacionGlobal(String notificacion) {
        return notificacion;
    }
}
