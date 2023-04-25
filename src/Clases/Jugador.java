package Clases;

public class Jugador {
    private String nombre;
    private int IDJugador;

    // Constructor

    public Jugador(String nombre, int IDJugador) {
        this.nombre = nombre;
        this.IDJugador = IDJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDJugador() {
        return IDJugador;
    }

    public void setIDJugador(int IDJugador) {
        this.IDJugador = IDJugador;
    }
}
