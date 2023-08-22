package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

public class NegocioPrivadoValidacion {
    protected Util utilObjeto = new Util();

    public NegocioPrivadoValidacion() {
    }


    public Boolean validarId(String id ) throws Exception {
        String expresionRegular = "^[0-9]{1,10}$";


        if(!utilObjeto.buscarCoincidencias(expresionRegular,id)){
            throw new Exception("Señor usuario su id debe solo tener digitos y ser menor a 10 ");
        }
        else
        {
            return true;
        }
    }



    public Boolean nombreRepresentanteLegal(String nombreRepresentanteLegal ) throws Exception {
        String expresionRegular = "^[\\p{L} .'-]{1,30}$";


        if(!utilObjeto.buscarCoincidencias(expresionRegular,nombreRepresentanteLegal)){
            throw new Exception("Señor usuario su nombreRepresentanteLegal no debe sobrepasar los 30 caracteres ");
        }
        else
        {
            return true;
        }
    }
}
