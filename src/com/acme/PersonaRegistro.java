package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        //Miriam, comenté la línea de código pq considero que se puede eliminar
        //System.out.println("Esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
