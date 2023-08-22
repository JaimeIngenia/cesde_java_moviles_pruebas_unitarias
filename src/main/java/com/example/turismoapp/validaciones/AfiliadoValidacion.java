package com.example.turismoapp.validaciones;
import com.example.turismoapp.utilidades.Util;

public class AfiliadoValidacion
{
    //ATRIBUTOS

    protected Util utilObjeto = new Util();

    //METODOS


    public AfiliadoValidacion() {
    }

    public AfiliadoValidacion(Util utilObjeto) {
        this.utilObjeto = utilObjeto;
    }

    public Boolean validarMembresia(Integer parametrovalorMembresia) throws Exception {
        String expresionRegular = "\\d+";

        String parametroString = Integer.toString(parametrovalorMembresia);

        if(!utilObjeto.buscarCoincidencias(expresionRegular,parametroString)){
            throw new Exception("Señor usuario su membresia está mal, debe tener solo digitos, no caracteres");
        }
        else if( parametrovalorMembresia <2000 || parametrovalorMembresia > 1500000 )
        {
            throw new Exception("Señor usuario no está dentro del rango determinado");
        }
        else
        {
            return true;
        }
    }


    public Boolean validarDescuentoMensualidad(Double pago ) throws Exception {
        String expresionRegular = "\\d+";
        String parametroString = Double.toString(pago);

        if( pago <0 || pago > 35000 )
        {
            throw new Exception("Señor usuario no está dentro del rango determinado máximo puede ser 35000 y no puede ser negativo");
        }
        else
        {
            return true;
        }
    }

    public Boolean validarDocumentoReferido(String documento ) throws Exception {
        String expresionRegular = "\\d+";


        if(!utilObjeto.buscarCoincidencias(expresionRegular,documento)){
            throw new Exception("Señor usuario su documento referido está mal, debe tener solo digitos, no caracteres");
        }
        else
        {
            return true;
        }
    }




}
