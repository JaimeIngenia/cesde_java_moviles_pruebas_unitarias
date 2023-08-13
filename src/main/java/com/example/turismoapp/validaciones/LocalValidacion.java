package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import com.example.turismoapp.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalValidacion {
    //ATRIBUTOS
    protected Util utilObjeto = new Util();
    public Boolean validarNit ( String nit ) throws Exception{

        String expresionRegularNit = "\\d+";
        //\\d{1,10}
        //^/d{10}$
        //\\d{10}
        //\\d+
        //if(utilObjeto.buscarCoincidencias(expresionRegularNit,nit))

        if(!utilObjeto.buscarCoincidencias(expresionRegularNit,nit)){
            throw new Exception(Mensajes.NIT_SOLO_DIGITOS.getMensaje());
        }
        else if(!(nit.length() == 10))
        {
            throw new Exception(Mensajes.NIT_10_DIGITOS.getMensaje());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarNombreLocal ( String nombre ) throws Exception {

        String expresionRegularNombreLocal = "^.{1,30}$";

        if(!utilObjeto.buscarCoincidencias(expresionRegularNombreLocal,nombre))
        {
            throw new Exception(Mensajes.NOMBRE_LOCAL_30_CARACTERES.getMensaje());
        }
        else
        {
            return true;
        }

    }

}
