package com.example.turismoapp;

import com.example.turismoapp.modelos.*;
import com.example.turismoapp.validaciones.ReservaValidacion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        //OBJETOS


        Scanner teclado = new Scanner(System.in);
        Oferta ofertaObjeto = new Oferta();
        Afiliado objetoAfiliado = new Afiliado();
        NoAfiliado objetoNoAfiliado = new NoAfiliado();
        EmpresaPrivada objetoEmpresaPrivada = new EmpresaPrivada();
        NegocioParticular objetoNegocioParticular = new NegocioParticular();
        AgrupacionCultural objetoAgrupacionCultural = new AgrupacionCultural();
        NegocioPrivado objetoNegocioPrivada = new NegocioPrivado();
        //Usuario usuarioObjeto = new Usuario();
        //Usuario jaimeObjeto = new Usuario();



/*      Reserva reservaObjeto = new Reserva();
        Local localObjeto = new Local();
        Oferta ofertaObjeto = new Oferta();
        */




        System.out.println("***Bienvenido***");
        System.out.println("1. Recogiendo datos del usuario: ");

        //VALIDACIONES PARA USUARIO

/*
        System.out.println("  -  Digita tus nombres y apellidos del primer objeto");
        usuarioObjeto.setNombres(teclado.nextLine());





        System.out.println("  -  Digita tus nombres y apellidos del SEGUNDO OBJETO ");
        jaimeObjeto.setNombres(teclado.nextLine());


        System.out.println("ESTOS SON LOS NOMBRES");
        System.out.println("EL Objeto NUMERO dos TIENE COMO NOMBRE SETEADO A:");
        System.out.println(jaimeObjeto.getNombres());


        System.out.println("EL Objeto NUMERO UNO TIENE COMO NOMBRE SETEADO A:");
        System.out.println(jaimeObjeto.getNombres());
*/


/*        System.out.println("Digite su correo electrónico: ");
        usuarioObjeto.setCorreoElectronico(teclado.nextLine());
        System.out.println(usuarioObjeto.getCorreoElectronico());

        System.out.println("Digite su ubicacion: ");
        usuarioObjeto.setUbicacion(teclado.nextInt());
        System.out.println(usuarioObjeto.getUbicacion());

        System.out.println("Mira todos los datos");
        System.out.println(usuarioObjeto.toString());*/

        //VALIDACIONES LOCAL

        /*System.out.println("Ingrese el número nit, en tabla Local");
        localObjeto.setNit(teclado.nextLine());
        System.out.println(localObjeto.getNit());*/
        /*
        System.out.println("Ingrese el nombre de su empresa, en tabla Local");
        localObjeto.setNombre(teclado.nextLine());
        System.out.println(localObjeto.getNombre());

        System.out.println("Mira todos los datos");
        System.out.println(localObjeto.toString());*/

        //VALIDACIONES OFERTA

        /* System.out.println("Digite el titulo de la tabla Ofertas");
        ofertaObjeto.setTitulo(teclado.nextLine());
        System.out.println(ofertaObjeto.getTitulo());
*/
/*

        System.out.println("Ingrese el año de la fecha1");
        Integer anioPrincipal = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha1");
        Integer mesPrincipal = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha1");
        Integer diaPrincipal = teclado.nextInt();
//*********************************************************************************************************************************************
        ofertaObjeto.setFechaInicio(anioPrincipal,mesPrincipal,diaPrincipal);
//*********************************************************************************************************************************************

        System.out.println("Ingrese el año de la fecha2");
        Integer anioSecundario = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha2");
        Integer mesSecundario = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha2");
        Integer diaSecundario = teclado.nextInt();

//*********************************************************************************************************************************************
        ofertaObjeto.setFechaFin(anioSecundario,mesSecundario,diaSecundario);
//*********************************************************************************************************************************************
*/

        /*System.out.println("Digite el costo por persona de la tabla Oferta");
        ofertaObjeto.setCostoPersona(teclado.nextDouble());
        System.out.println(ofertaObjeto.getCostoPersona());*/

        //VALIDACIONES RESERVA


        /*System.out.println("Ingrese el año de la fecha Reserva");
        Integer anioPrincipalReserva = teclado.nextInt();


        System.out.println("Ingrese el mes de la fecha Reserva");
        Integer mesPrincipalReserva = teclado.nextInt();


        System.out.println("Ingrese el día de la fecha Reserva");
        Integer diaPrincipalReserva = teclado.nextInt();
//*********************************************************************************************************************************************
        reservaObjeto.setFechaReserva(anioPrincipalReserva,mesPrincipalReserva,diaPrincipalReserva);
//*********************************************************************************************************************************************
        System.out.println(reservaObjeto.getFechaReserva());

         */

/*        System.out.println("Digite la cantidad de personas para hacer las correspondientes reservas");
        Integer numeroReservas = teclado.nextInt();
        reservaObjeto.setNumeroPersonas(numeroReservas);*/























        //VALIDACIONES FECHAS

        /*System.out.println("Ingrese el año de la fecha1");
        String anioPrincipal = teclado.next();
        reservaObjeto.setAnioFechaReserva(anioPrincipal);

        System.out.println("Ingrese el mes de la fecha1");
        String mesPrincipal = teclado.next();
        reservaObjeto.setMesFechaReserva(mesPrincipal);

        System.out.println("Ingrese el día de la fecha1");
        String diaPrincipal = teclado.next();
        reservaObjeto.setDiaFechaReserva(diaPrincipal);

        Integer anioPrincipalInteger = Integer.parseInt(anioPrincipal);
        Integer mesPrincipalInteger = Integer.parseInt(mesPrincipal);
        Integer diaPrincipalInteger = Integer.parseInt(diaPrincipal);
//*********************************************************************************************************************************************
        LocalDate fechaUnoFaseUno = reservaObjeto.cambiarIntegerLocalDate(anioPrincipalInteger,mesPrincipalInteger,diaPrincipalInteger);
//*********************************************************************************************************************************************


        System.out.println("Ingrese el año de la fecha2");
        String anioPrincipalFechaDos = teclado.next();
        reservaObjeto.setAnioFechaDosReserva(anioPrincipalFechaDos);

        System.out.println("Ingrese el mes de la fecha2");
        String mesPrincipalFechaDos = teclado.next();
        reservaObjeto.setMesFechaDosReserva(mesPrincipalFechaDos);

        System.out.println("Ingrese el día de la fecha2");
        String diaPrincipalFechaDos = teclado.next();
        reservaObjeto.setDiaFechaDosReserva(diaPrincipalFechaDos);

        Integer anioPrincipalFechaDosInteger = Integer.parseInt(anioPrincipalFechaDos);
        Integer mesPrincipalFechaDosInteger = Integer.parseInt(mesPrincipalFechaDos);
        Integer diaPrincipalFechaDosInteger = Integer.parseInt(diaPrincipalFechaDos);
//*********************************************************************************************************************************************
        LocalDate fechaDosFaseUno = reservaObjeto.cambiarIntegerLocalDate(anioPrincipalFechaDosInteger,mesPrincipalFechaDosInteger,diaPrincipalFechaDosInteger);
//*********************************************************************************************************************************************

        System.out.println(reservaObjeto.diferenciaFechas(fechaUnoFaseUno,fechaDosFaseUno));
*/














        //System.out.println(reservaObjeto.toString());
        //System.out.println("La diferencia entre fechas es");
        // System.out.println(reservaObjeto.diferenciaFechas(fechaUnoFaseUno,fechaDosFaseUno));







//*********************************************************************************************************************************************
        //AFILIADO
//*********************************************************************************************************************************************

        /*        System.out.println("Digite el pago de mensualidad en pesos:");
        Double ejemplo = objetoAfiliado.calcularDescuentoMensualidad(teclado.nextDouble());
        System.out.println("El pago es de :" + ejemplo);*/

        /*
        System.out.println("Señor usuario digite su documento referido: ");
        objetoAfiliado.setDocumentoReferido(teclado.nextLine());
        System.out.println(objetoAfiliado.getDocumentoReferido());
        */

        /*System.out.println("La anualidad del afiliado es:" + objetoAfiliado.calcularAnualidad());*/

//*********************************************************************************************************************************************
        //NO  AFILIADO
//*********************************************************************************************************************************************

/*        System.out.println("La anualidad del NO Afiliado es:" + objetoNoAfiliado.calcularAnualidad());*/

        System.out.println("Ambos perfiles pueden generar notificaciones promocionando eventos, promociones o info general");
        System.out.println("En este caso, señor usuario digite la notificacion para Afiliado:");
        String a3 = objetoAfiliado.postearNotificacionGlobal(teclado.nextLine());
        System.out.println("esto es para agrupacion cultural: " + a3);

        System.out.println("En este caso, señor usuario digite la notificacion para No Afiliado:");
        String a4 = objetoNoAfiliado.postearNotificacionGlobal(teclado.nextLine());
        System.out.println("esto es para empresa privada: " + a4);
//*********************************************************************************************************************************************
        //LOCAL
//*********************************************************************************************************************************************
  /*      System.out.println("Toda empresa paga una anualidad de 120000 :" + objetoEmpresaPrivada.calcularAnualidad());

        System.out.println("Yo como particular tengo un cobro mensual de 70000 :" + objetoNegocioParticular.getCostoMensual());*/

/*        System.out.println("Yo como entidad cultural tengo una descripción de la actividad cultural a la que me dedico, Describa aquí su actividad: ");
        objetoAgrupacionCultural.setDescripcionActividad(teclado.nextLine());
        System.out.println(objetoAgrupacionCultural.getDescripcionActividad());*/


   /*     System.out.println("Yo como entidad cultural tengo un descuento del 25% sobre la anualidad que es de $1200000 : ");
        System.out.println(objetoAgrupacionCultural.calcularAnualidad());
*/

    /*    System.out.println("Yo como negocio privado tengo los datos de id y nombre del representante legal de la empresa (validados según su criterio)");
        System.out.println("Digite el nombre del representante legal de la empresa");
        objetoNegocioPrivada.setNombreRepresentanteLegal(teclado.nextLine());*/

/*        System.out.println("-Ambos perfiles pueden generar notificaciones asociadas a información de cada empresa.");
        System.out.println("En este caso, señor usuario digite la notificacion para agrupacion cultural:");
        String a = objetoAgrupacionCultural.postearNotificacionGlobal(teclado.nextLine());
        System.out.println("esto es para agrupacion cultural: " + a);

        System.out.println("En este caso, señor usuario digite la notificacion para Empresa privada:");
        String a2 = objetoEmpresaPrivada.postearNotificacionGlobal(teclado.nextLine());
        System.out.println("esto es para empresa privada: " + a2);*/

    }
}