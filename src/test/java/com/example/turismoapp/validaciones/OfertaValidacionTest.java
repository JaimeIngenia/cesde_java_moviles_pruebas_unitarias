package com.example.turismoapp.validaciones;

import com.example.turismoapp.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion objetoOfertaValidacion;

    @BeforeEach
    public void setUp() {
        this.objetoOfertaValidacion = new OfertaValidacion();
    }
    //validarCosto
    @Test
    public void validarCostoCorrecto(){
        Double costoPersonaCorrecto = 500.0;

        Assertions.assertDoesNotThrow(()-> objetoOfertaValidacion.validarCosto(costoPersonaCorrecto));
    }

    @Test
    public void validarCostoIncorrecto(){
        Double costoPersonaIncorrecto = -500.0;

        //EJECUTAR Y VERIFICAR
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoOfertaValidacion.validarCosto(costoPersonaIncorrecto) );

        //REVISAR EL MENSAJE
        Assertions.assertEquals(Mensajes.COSTO_INVALIDO.getMensaje() , exceptionJaime.getMessage() );
    }

    //validarDosFechas
    @Test
    public void validarDosFechasCorrecto() throws Exception {
        //LocalDate.of(anio,mes,dia)
        LocalDate fechaInicioCorrecta = LocalDate.of(2023,8,8) ;
        LocalDate fechaFinCorrecta = LocalDate.of(2023,8,18) ;

        Assertions.assertDoesNotThrow( ()-> objetoOfertaValidacion.validarDosFechas(fechaInicioCorrecta,fechaFinCorrecta));

    }

    @Test
    public void validarDosFechasIncorrecto(){

        LocalDate fechaInicioIncorrecta = LocalDate.of(2023,8,8) ;
        LocalDate fechaFinIncorrecta = LocalDate.of(2023,8,7 );

        //EJECUTAR Y VERIFICAR
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoOfertaValidacion.validarDosFechas(fechaInicioIncorrecta,fechaFinIncorrecta) );

        //REVISAR EL MENSAJE
        Assertions.assertEquals(Mensajes.DIFERENCIA_FECHAS.getMensaje() , exceptionJaime.getMessage() );


    }

    //Validar Titulo

    @Test
    public void validarTituloCorrecto (){
        String  tituloCorrecto = "RESERVA ANDRES ISLAS";

        Assertions.assertDoesNotThrow(()-> objetoOfertaValidacion.validarTitulo(tituloCorrecto));

    }
    @Test
    public void validarTituloIncorrecto (){
        String  tituloIncorrecto = "RESERVA PARA SAN ANDRES ISLAS RESERVA PARA SAN ANDRES ISLAS RESERVA PARA SAN ANDRES ISLAS";
        //EJECUTAR Y VERIFICAR
        Exception exceptionJaime = Assertions.assertThrows( Exception.class , ()-> objetoOfertaValidacion.validarTitulo(tituloIncorrecto) );

        //REVISAR EL MENSAJE
        Assertions.assertEquals(Mensajes.TITULO_20_CARACTERES.getMensaje() , exceptionJaime.getMessage() );
    }
}