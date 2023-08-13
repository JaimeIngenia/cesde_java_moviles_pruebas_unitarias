package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion objetoReservaValidacion ;


    @BeforeEach
    public void setUp() {
        this.objetoReservaValidacion = new ReservaValidacion();
    };

    //Formato
    @Test

    public void validarFormatoFechaCorrecta(){
        Integer anioCorrecto = 2023;
        Integer mesCorrecto = 8;
        Integer diaCorrecto = 7;

        Assertions.assertDoesNotThrow( ()->objetoReservaValidacion.validarFormato(anioCorrecto,mesCorrecto,diaCorrecto));//lanzar si no es verdad

    };

   /* @Test
    public void validarFormatoFechaIncorrecta(){
        Integer anioIncorrecto = 2020;
        Integer mesIncorrecto = 8;
        Integer diaIncorrecto = 7;

        //EJECUTAR Y VERIFICAR

        //Esérar que salga la esepción y almacenarla en esa variable
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoReservaValidacion.validarFormato(anioIncorrecto,mesIncorrecto,diaIncorrecto) );

        //REVISAR EL MENSAJE

        Assertions.assertNotEquals(Mensajes.FORMATO_INVALIDO.getMensaje() , exceptionJaime.getMessage() );
    };
*/
    //nuemero_reservas

    @Test
    public void validarNumeroReservasCorrecta(){

        Integer reservaCorrecta = 4;

        Assertions.assertDoesNotThrow( ()->objetoReservaValidacion.validarNumeroReservas(reservaCorrecta));//lanzar si no es verdad

    }

    @Test
    public void validarNumeroReservasIncorrecta(){
        Integer reservaIncorrecta = 7;
        //EJECUTAR Y VERIFICAR

        //Esperar que salga la esepción y almacenarla en esa variable
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoReservaValidacion.validarNumeroReservas(reservaIncorrecta) );

        //REVISAR EL MENSAJE

        Assertions.assertEquals(Mensajes.NUMERO_RESERVAS.getMensaje() , exceptionJaime.getMessage() );

    }


}