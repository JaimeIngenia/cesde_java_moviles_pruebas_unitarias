package com.example.turismoapp.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalTest {

    private Local objetoLocal;

    @BeforeEach
    public void setUp() {
        objetoLocal = new Local();
    }


    //setNit
    @Test
    public void setNitCorrecto(){
        String nitCorrecto = "1234567899";
        objetoLocal.setNit( nitCorrecto );  //Probando y Ejecutando el set
        Assertions.assertDoesNotThrow( ()-> objetoLocal.getNit());
    }
    @Test
    public void setNitIncorrecto(){
        String nitIncorrecto = "123456789";

        objetoLocal.setNit(nitIncorrecto);
        Assertions.assertNotEquals(nitIncorrecto , objetoLocal.getNit());
    }


    //setNombre


    @Test
    public void setNombreCorrecto(){
        String nombreCorrecto = "Este es un correcto nombre de local";
        objetoLocal.setNombre( nombreCorrecto );  //Probando y Ejecutando el set

        Assertions.assertDoesNotThrow( ()-> objetoLocal.getNombre());
    }
    @Test
    public void setNombreIncorrecto(){
        String nombreIncorrecto = "Este es un Incorrecto nombre de local Este es un Incorrecto nombre de local Este es un Incorrecto nombre de local Este es un Incorrecto nombre de local";

        objetoLocal.setNit(nombreIncorrecto);
        Assertions.assertNotEquals(nombreIncorrecto , objetoLocal.getNombre());
    }

}