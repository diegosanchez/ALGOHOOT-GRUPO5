package edu.fiuba.algo3.modelo;

public class Opcion {
    private String texto;

    public Opcion(String texto) {
        this.texto = texto;
    }

    public Boolean esIgual(Opcion opcion) {
        return this.texto.equals(opcion.texto);
    }

}