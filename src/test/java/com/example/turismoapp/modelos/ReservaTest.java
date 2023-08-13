package com.example.turismoapp.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {


    private Reserva objetoReserva;

    @BeforeEach
    public void configuracionInicial(){ // Estandar sería SetUp la configuracion inicial
        this.objetoReserva = new Reserva();
    }

    //numeroPersonaS
    @Test
    public void setNumeroPersonasCorrecto() throws Exception {
        Integer numeroPersonasValido = 3;  //PREPARANDO

        objetoReserva.setNumeroPersonas( numeroPersonasValido );  //Probando y Ejecutando el set

        Assertions.assertEquals(numeroPersonasValido  , this.objetoReserva.getNumeroPersonas()); //VERIFICAR
    }

/*    @Test
    public void setNumeroPersonasIncorrecto() throws Exception {

        Integer numeroPersonasInvalido = 7;
        objetoReserva.setNumeroPersonas(numeroPersonasInvalido);
        Assertions.assertNotEquals(numeroPersonasInvalido , objetoReserva.getNumeroPersonas());

    }*/

    //setFechaReserva

    @Test
    public void setFechaReservaCorrecto(){
        Integer anioCorrecto = 2023;
        Integer mesCorrecto = 8;
        Integer diaCorrecto = 8;

        LocalDate fechaCorrecta = LocalDate.of(anioCorrecto,mesCorrecto,diaCorrecto);

        objetoReserva.setFechaReserva( anioCorrecto,mesCorrecto,diaCorrecto );  //Probando y Ejecutando el set

        Assertions.assertEquals(fechaCorrecta  , this.objetoReserva.getFechaReserva()); //VERIFICAR
    }
/*
    @Test
    public void setFechaReservaIncorrecto(){
        Integer anioIncorrecto = 2024;
        Integer mesIncorrecto = 8;
        Integer diaIncorrecto = 8;

        LocalDate fechaIncorrecta = LocalDate.of(anioIncorrecto,mesIncorrecto,diaIncorrecto);
        objetoReserva.setFechaReserva(anioIncorrecto,mesIncorrecto,diaIncorrecto);
        Assertions.assertNotEquals(fechaIncorrecta , objetoReserva.getFechaReserva());
    }
*/

}