/*
package com.example.turismoapp.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario objetoUsuario;

    @BeforeEach
    public void configuracionInicial(){ // Estandar sería SetUp la configuracion inicial
        this.objetoUsuario = new Usuario();
        }


    //NOMBRES
    @Test
    public void setCorrectoNombres () {

        String nombrePruebaValido = "Jaime Andrés Moncayo Parra";  //PREPARANDO

        objetoUsuario.setNombres( nombrePruebaValido );  //Probando y Ejecutando el set

        Assertions.assertEquals(nombrePruebaValido  , this.objetoUsuario.getNombres()); //VERIFICAR
    }

    @Test
    public void setIncorrectoNombres(){

        String nombrePruebaInvalido = "Jaime231";
        objetoUsuario.setNombres(nombrePruebaInvalido);
        Assertions.assertNotEquals(nombrePruebaInvalido , objetoUsuario.getNombres());

    }

    //UBICACION

    @Test
    public void setUbicacionCorrecto(){
        Integer ubicacionValido = 2;  //PREPARANDO

        objetoUsuario.setUbicacion( ubicacionValido );  //Probando y Ejecutando el set

        Assertions.assertEquals(ubicacionValido  , this.objetoUsuario.getUbicacion()); //VERIFICAR
    }

   @Test
    public void setUbicacionIncorrecto(){
        Integer ubicacionInvalido = 12;
        objetoUsuario.setUbicacion(ubicacionInvalido);
        Assertions.assertNotEquals(ubicacionInvalido , objetoUsuario.getUbicacion());
    }

    //CORREo ELECTRONICO
   @Test
    public void setCorreoElectronicoCorrecto(){
       String correoValido = "jamoncayop@unal.edu.co";  //PREPARANDO

       objetoUsuario.setCorreoElectronico( correoValido );  //Probando y Ejecutando el set

       Assertions.assertEquals(correoValido  , this.objetoUsuario.getCorreoElectronico()); //VERIFICAR
    }

    @Test
    public void setCorreoElectronicoIncorrecto(){
        String correoInvalido = "jaimeunalcom";
        objetoUsuario.setCorreoElectronico(correoInvalido);
        Assertions.assertNotEquals(correoInvalido , objetoUsuario.getCorreoElectronico());
    }
}*/
