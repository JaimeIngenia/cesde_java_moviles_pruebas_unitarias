package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import com.example.turismoapp.utilidades.Util;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaValidacion {

    //ATRIBUTOS

    protected Util utilObjeto = new Util();

    //METODOS

    public Boolean validarTitulo(String titulo)throws Exception{
        String expresionRegularTitulo = "^.{1,20}$";

        if(!utilObjeto.buscarCoincidencias(expresionRegularTitulo,titulo))
        {
            throw new Exception(Mensajes.TITULO_20_CARACTERES.getMensaje());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarCosto(Double costoPersona) throws Exception {
        if(costoPersona<0){
            throw new Exception("Señor usuario su costo persona no debe ser negativo");
        }
        else{
            return true;
        }
    }


    public Boolean validarDosFechas ( LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if(!utilObjeto.diferenciaFechas(fechaInicio,fechaFin)){
            throw new Exception(Mensajes.DIFERENCIA_FECHAS.getMensaje());
        }else{
            return true;
        }

    }

    public Boolean validarAnio ( Integer anio ) throws Exception{
        if( (anio>0) && (anio<2024) ){
            return true;
        }
        else{

            throw new Exception("Señor usuario el año debe ser positivo y menor a 2023");
        }
    }

    public Boolean validarMes ( Integer mes ) throws Exception{
        if( (mes>0) && (mes<12) ){
//            throw new Exception("Señor usuario el mes debe ser de 0 a 12");
            return true;
        }
        else
        {
//            return true;
            throw new Exception("Señor usuario el mes debe ser de 0 a 12");
        }
    }


    public Boolean validarDia( Integer dia ) throws Exception{
        if( (dia>0) && (dia<30) ){
            //throw new Exception("Señor usuario el dia debe ser de 0 a 30");
            return true;
        }
        else
        {
//            return true;
            throw new Exception("Señor usuario el dia debe ser de 0 a 30");
        }
    }




}
