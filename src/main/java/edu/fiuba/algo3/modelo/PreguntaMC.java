package edu.fiuba.algo3.modelo;

public class PreguntaMC {
    private String textoPregunta;
    private RespuestaMC correcta;

    public PreguntaMC(String texto, RespuestaMC respuesta) {
        this.textoPregunta = texto;
        this.correcta = respuesta;
    }

    public Puntaje calcularPuntaje(RespuestaMC respuestaJugador){
        Puntaje p = new Puntaje(); //Puntaje lo creo aca asi cada clase de pregunta crea su propio tipo de puntaje.
        if (respuestaJugador.esIgual(this.correcta)) {
            p.sumar();
        }
        return p;
    }
}
