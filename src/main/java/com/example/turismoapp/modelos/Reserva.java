package com.example.turismoapp.modelos;
import com.example.turismoapp.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Reserva {
//ATRIBUTOS - VARIABLES DATOS
    private Integer numeroPersonas;
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    private ReservaValidacion validarObjetoReserva = new ReservaValidacion();


//CONSTRUCTOR VACIO
    public Reserva() {
    }


//CONSTRUCTOR LLENO

    public Reserva(Integer numeroPersonas,Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, ReservaValidacion validarObjetoReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.validarObjetoReserva = validarObjetoReserva;
        this.numeroPersonas = numeroPersonas;
    }


    //GETTERS Y SETTERS


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Integer anio, Integer mes, Integer dia) {
        try{
            this.validarObjetoReserva.validarAnio(anio);
            this.validarObjetoReserva.validarMes(mes);
            this.validarObjetoReserva.validarDia(dia);

            LocalDate fecha = LocalDate.of(anio,mes,dia);

            this.validarObjetoReserva.validarFormato(anio,mes,dia);

            this.fechaReserva = fecha;

        }
        catch(Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public ReservaValidacion getValidarObjetoReserva() {
        return validarObjetoReserva;
    }

    public void setValidarObjetoReserva(ReservaValidacion validarObjetoReserva) {
        this.validarObjetoReserva = validarObjetoReserva;
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) throws Exception {
        this.validarObjetoReserva.validarNumeroReservas(numeroPersonas);
        this.numeroPersonas = numeroPersonas;
    }
//METODOS JAIME
}
