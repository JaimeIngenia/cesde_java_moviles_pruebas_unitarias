package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Util;

public class NoAfiliadoValidacion {

    //ATRIBUTOS
    protected Util utilObjeto = new Util();

    //METODOS


    public NoAfiliadoValidacion(Util utilObjeto) {
        this.utilObjeto = utilObjeto;
    }

    public NoAfiliadoValidacion() {
    }

    //METODOS

    public Boolean validarNumeroReservasMensuales(Integer parametroNumeroReservas) throws Exception {
        String expresionRegular = "^[+-]?//d+$";

        String paraetroString = Integer.toString(parametroNumeroReservas);
        if( !utilObjeto.buscarCoincidencias(expresionRegular,paraetroString)){
            throw new Exception("Señor usuario su numero de reservas está mal, debe tener solo digitos");
        }
        else if ( parametroNumeroReservas < 0 ){
            throw new Exception("Señor usuario el numero de reservas no puede ser negativo");
        }
        else
        {
            return true;
        }
    }
}
