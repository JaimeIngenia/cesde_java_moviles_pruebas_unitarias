package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

public class AgrupacionCulturalValidacion {

    protected Util utilObjeto = new Util();

    public AgrupacionCulturalValidacion() {
    }
    public Boolean validarDescripcionActividad(String documento ) throws Exception {
        String expresionRegular = "^.{1,3000}$";


        if(!utilObjeto.buscarCoincidencias(expresionRegular,documento)){
            throw new Exception("Señor usuario su descripcion de actividad no debe sobrepasar los 3000 caracteres");
        }
        else
        {
            return true;
        }
    }
}
