package com.example.turismoapp.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaTest {


    private Oferta objetoOferta;

    @BeforeEach
    public void configuracionInicial(){ // Estandar sería SetUp la configuracion inicial
        this.objetoOferta = new Oferta();
    }

    //TITULO
    @Test
    public void setTituloCorrecto (){
        String tituloCorrecto = "Titulo correcto";  //PREPARANDO

        objetoOferta.setTitulo( tituloCorrecto );  //Probando y Ejecutando el set

        Assertions.assertEquals(tituloCorrecto  , this.objetoOferta.getTitulo()); //VERIFICAR
    }

    @Test
    public void setTituloIncorrecto (){
        String tituloIncorrecto = "Este es un titulo incorrecto Este es un titulo incorrecto Este es un titulo incorrecto";
        objetoOferta.setTitulo(tituloIncorrecto);
        Assertions.assertNotEquals(tituloIncorrecto , objetoOferta.getTitulo());
    }

    //fechaInicio

    @Test
    public void setfechaInicioCorrecta (){
        Integer anioCorrecto = 2023;
        Integer mesCorrecto = 8;
        Integer diaCorrecto = 8;

        LocalDate fechaCorrecta = LocalDate.of(anioCorrecto,mesCorrecto,diaCorrecto);

        objetoOferta.setFechaInicio( anioCorrecto,mesCorrecto,diaCorrecto );  //Probando y Ejecutando el set

        Assertions.assertEquals(fechaCorrecta  , this.objetoOferta.getFechaInicio()); //VERIFICAR
    }

/*    @Test
    public void setfechaInicioIncorrecta () {
        Integer anioIncorrecto = 2023;
        Integer mesIncorrecto = 8;
        Integer diaIncorrecto = 8;

        LocalDate fechaIncorrecta = LocalDate.of(anioIncorrecto, mesIncorrecto, diaIncorrecto);

        objetoOferta.setFechaInicio(anioIncorrecto,mesIncorrecto,diaIncorrecto);
        Assertions.assertNotEquals(fechaIncorrecta , objetoOferta.getFechaInicio());
    }*/

    //fechaFin

/*    @Test
    public void settestFechaFinCorrecto (){
        Integer anioCorrectoInicio = 2023;
        Integer mesCorrectoInicio = 8;
        Integer diaCorrectoInicio = 8;

        Integer anioCorrectoFin = 2023;
        Integer mesCorrectoFin = 8;
        Integer diaCorrectoFin = 9;

        //LocalDate fechaCorrectaInicio = LocalDate.of(anioCorrectoInicio,mesCorrectoInicio,diaCorrectoInicio);
        this.objetoOferta.setFechaInicio( anioCorrectoInicio,mesCorrectoInicio,diaCorrectoInicio );
        LocalDate fechaCorrectaFin = LocalDate.of(anioCorrectoFin,mesCorrectoFin,diaCorrectoFin);

        objetoOferta.setFechaFin( anioCorrectoFin,mesCorrectoFin,diaCorrectoFin );  //Probando y Ejecutando el set
        Assertions.assertEquals(fechaCorrectaFin  , this.objetoOferta.getFechaFin()); //VERIFICAR
    }

    @Test
    public void settestFechaFinIncorrecto (){
        Integer anioIncorrectoInicio = 2023;
        Integer mesIncorrectoInicio = 8;
        Integer diaIncorrectoInicio = 8;

        Integer anioIncorrectoFin = 2023;
        Integer mesIncorrectoFin = 7;
        Integer diaIncorrectoFin = 9;

        this.objetoOferta.setFechaInicio( anioIncorrectoInicio,mesIncorrectoInicio,diaIncorrectoInicio );
        LocalDate fechaIncorrectaFin = LocalDate.of(anioIncorrectoFin,mesIncorrectoFin,diaIncorrectoFin);

        objetoOferta.setFechaFin( anioIncorrectoFin,mesIncorrectoFin,diaIncorrectoFin );  //Probando y Ejecutando el set
        Assertions.assertEquals(fechaIncorrectaFin  , this.objetoOferta.getFechaFin()); //VERIFICAR
    }*/

    //costoPersona

    @Test
    public void setCostoPersonaCorrecto(){
        Double costoPersonaCorrecto = 5000.0;  //PREPARANDO

        objetoOferta.setCostoPersona( costoPersonaCorrecto );  //Probando y Ejecutando el set

        Assertions.assertEquals(costoPersonaCorrecto  , this.objetoOferta.getCostoPersona()); //VERIFICAR
    }

    @Test
    public void setCostoPersonaIncorrecto() {
        Double costoPersonaIncorrecto = -5000.0;  //PREPARANDO
        objetoOferta.setCostoPersona(costoPersonaIncorrecto);
        Assertions.assertNotEquals(costoPersonaIncorrecto , objetoOferta.getCostoPersona());

    }





}