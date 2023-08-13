package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import com.example.turismoapp.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

//ATRIBUTOS

    protected Util utilObjeto = new Util();



//CONSTRUCTOR VACIO
    public UsuarioValidacion() {
    }

    //METODOS ORDINARIOS PARA VALIDACIONES

    public Boolean validarNombre(String nombres)throws Exception {
        String expresionRegular = "^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$";
        //^[A-Za-z\s]+$
        //^[A-Za-z]+$
        //^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$


        //Pattern patron = Pattern.compile(expresionRegular);
        //Matcher coincidencia = patron.matcher(nombres);
        if(!utilObjeto.buscarCoincidencias(expresionRegular,nombres))
        {
            //throw new Exception("Señor usuario su nombre solo puede tener letras");
            throw new Exception(Mensajes.NOMBRE_INVALIDO_SOLO_LETRAS.getMensaje());
        }

        else if (nombres.length()<10)
        {
            throw new Exception(Mensajes.NOMBRE_INVALIDO_MUY_CORTO.getMensaje());
        }

        else
        {
            return true;
        }
    }

    public Boolean validarUbicacion (Integer ubicacion)throws Exception {



        if(ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4))
        {
            return true;
        }
        else
        {
            throw new Exception(Mensajes.UBICACION_INVALIDO.getMensaje());
        }
    }

    public Boolean validarCorreo (String correo) throws Exception {
        String expresionRegularCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        //Pattern patronCorreo = Pattern.compile(expresionRegularCorreo);
        //Matcher coincidenciaCorreo = patronCorreo.matcher(expresionRegularCorreo);
        if(!utilObjeto.buscarCoincidencias(expresionRegularCorreo,correo))
        {
            throw new Exception(Mensajes.CORREO_INVALIDO.getMensaje());
        }
        else
        {
            return true;
        }
    }



}
