package com.example.turismoapp.modelos;
import com.example.turismoapp.utilidades.Util;
import com.example.turismoapp.validaciones.OfertaValidacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Oferta {
//ATRIBUTOS - VARIABLES DATOS
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    //private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;

    private OfertaValidacion validarObjetoOferta = new OfertaValidacion();

    protected Util utilObjeto = new Util();

//CONSTRUCTOR VACIO

    public Oferta() {
    }
//CONSTRUCTOR LLENO

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal, OfertaValidacion validarObjetoOferta, Util utilObjeto) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
        this.validarObjetoOferta = validarObjetoOferta;
        this.utilObjeto = utilObjeto;
    }


// GETTERS Y SETTERS


    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Integer anio, Integer mes, Integer dia) {

        try {
            this.validarObjetoOferta.validarAnio(anio);
            this.validarObjetoOferta.validarMes(mes);
            this.validarObjetoOferta.validarDia(dia);

            LocalDate fecha = LocalDate.of(anio,mes,dia);

            this.validarObjetoOferta.validarDosFechas(this.fechaInicio,fecha);

            this.fechaFin = fechaFin;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }




    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer anio, Integer mes, Integer dia) {

    try{
        this.validarObjetoOferta.validarAnio(anio);
        this.validarObjetoOferta.validarMes(mes);
        this.validarObjetoOferta.validarDia(dia);

        LocalDate fecha = LocalDate.of(anio,mes,dia);
        this.fechaInicio = fecha;

    }
    catch(Exception error)
        {
            System.out.println(error.getMessage());
        }


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try
        {
            this.validarObjetoOferta.validarTitulo(titulo);
            this.titulo = titulo;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try
        {
            this.validarObjetoOferta.validarCosto(costoPersona);
            this.costoPersona = costoPersona;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public OfertaValidacion getValidarObjetoOferta() {
        return validarObjetoOferta;
    }

    public void setValidarObjetoOferta(OfertaValidacion validarObjetoOferta) {
        this.validarObjetoOferta = validarObjetoOferta;
    }

    public Util getUtilObjeto() {
        return utilObjeto;
    }

    public void setUtilObjeto(Util utilObjeto) {
        this.utilObjeto = utilObjeto;
    }

    //METODOS JAIME

    public LocalDate cambiarIntegerLocalDate(Integer anio, Integer mes, Integer dia){
        LocalDate fechaConfigurada_dos = LocalDate.of(anio,mes,dia);
        return fechaConfigurada_dos;
    }


}
