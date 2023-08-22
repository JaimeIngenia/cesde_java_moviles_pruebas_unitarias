package com.example.turismoapp.utilidades;

public enum Mensajes {
    NOMBRE_INVALIDO_SOLO_LETRAS("Señor usuario su nombre solo puede tener letras"),
    NOMBRE_INVALIDO_MUY_CORTO("Señor usuario su nombre debe tener más de 10 caracteres"),
    UBICACION_INVALIDO("Señor usuario su ubicacion no es válida"),

    FORMATO_INVALIDO("Señor usuario, el formato de la fecha debe ser dd/MM/yyyy"),
    NUMERO_RESERVAS("Señor usuario está sobrepasando el máximo de personas"),
    COSTO_INVALIDO("Señor usuario su costo persona no debe ser negativo"),

    DIFERENCIA_FECHAS("Señor usuario las fechas son ilogicas, porque la fecha fin no puede menor a la fecha inicio"),
    TITULO_20_CARACTERES("Señor usuario su Titulo no puede tener más de 20 caracteres"),
    NIT_SOLO_DIGITOS("Señor usuario su nit esta mal, debe tener solo dígitos, no caracteres"),
    NIT_10_DIGITOS("Señor usuario su nit esta mal, debe tener al menos 10 digitos"),
    NOMBRE_LOCAL_30_CARACTERES("Señor usuario su nombre de local esta mal, no debe sobre pasar los 30 caracteres"),
    NOMBRE_LOCAL_15_CARACTERES("Señor usuario su nombre de local esta mal, no debe sobre pasar los 15 caracteres"),
    CORREO_INVALIDO("Señor usuario su correo esta mal no cumple con los requisitos para ser correo");
    //ATRIBUTO

    private String mensaje;

    //CONSTRUCTOR LLENO

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    //GETTERS

    public String getMensaje() {
        return mensaje;
    }

}
