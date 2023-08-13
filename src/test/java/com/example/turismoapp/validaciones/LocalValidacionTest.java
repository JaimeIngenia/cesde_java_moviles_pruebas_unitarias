package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {
    private LocalValidacion objetoLocalValidacion;

    @BeforeEach
    public void setUp(){
        objetoLocalValidacion = new LocalValidacion();
    }
    //validacion del nit
    @Test
    public void validarNitCorrecto(){
        String nitCorrecto = "1234567899";

        Assertions.assertDoesNotThrow( ()-> objetoLocalValidacion.validarNit(nitCorrecto));
    }
    @Test
    public void validarNitIcorrecto(){
        String nitIncorrecto_digitos = "1s34567899";
        String nitIncorrecto_cantMax = "18834567899";

        //EJECUTAR Y VERIFICAR
        Exception exceptionJaime_digitos = Assertions.assertThrows( Exception.class , ()-> objetoLocalValidacion.validarNit(nitIncorrecto_digitos) );
        Exception exceptionJaime_cantidadMaxima = Assertions.assertThrows( Exception.class , ()-> objetoLocalValidacion.validarNit(nitIncorrecto_cantMax) );

        //REVISAR EL MENSAJE
        Assertions.assertEquals(Mensajes.NIT_SOLO_DIGITOS.getMensaje() , exceptionJaime_digitos.getMessage() );
        Assertions.assertEquals(Mensajes.NIT_10_DIGITOS.getMensaje() , exceptionJaime_cantidadMaxima.getMessage() );

    }

    //validarNombreLocal
    @Test
    public void validarNombreLocalCorrecto (){
        String nombreCorrecto = "Nombre del local correcto";

        Assertions.assertDoesNotThrow( () -> objetoLocalValidacion.validarNombreLocal(nombreCorrecto) );
    }
    @Test
    public void validarNombreLocalIncorrecto (){
        String nombreIncorrecto = "Nombre del local correcto Nombre del local correcto Nombre del local correcto Nombre del local correcto Nombre del local correcto Nombre del local correcto";


        //EJECUTAR Y VERIFICAR
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoLocalValidacion.validarNombreLocal(nombreIncorrecto) );

        //REVISAR EL MENSAJE
        Assertions.assertEquals(Mensajes.NOMBRE_LOCAL_30_CARACTERES.getMensaje() , exceptionJaime.getMessage() );
    }
}