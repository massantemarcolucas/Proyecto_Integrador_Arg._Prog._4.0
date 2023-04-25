package Clases;

import java.util.Objects;
import java.util.Scanner;

public class Pronostico<equipoSeleccionado> {
    private Jugador IDjugador; //Jugador "tal"
    private Partido partido; // A que partido hace referencia

    private int puntaje; // cuantos puntos sumó
    String equipoSeleccionado = "";
    public void SeleccionarEquipo (equipoSeleccionado){ //selección de equipo según el partido (2 equipos disponibles).
        String EquipoA = String.valueOf(Partido.getEquipoA()); // Los equipos los toma de la clase partido.
        String EquipoB = String.valueOf(Partido.getEquipoB());
        System.out.println("Ronda " + Ronda.getNumeroDeRonda() + "\n Equipo A: " + EquipoA +
                "\n Equipo B: " + EquipoB + "\n Quien cree que ganará, A o B?");
        Scanner seleccionar = new Scanner(System.in);
        String equipoSeleccionado = seleccionar.next();
        if (equipoSeleccionado.equals(EquipoA)){
            equipoSeleccionado = EquipoA;
        } else if (equipoSeleccionado.equals(EquipoB)) {
            equipoSeleccionado = EquipoB;
        }
        System.out.println("Su equipo es " + equipoSeleccionado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pronostico that)) return false;
        return Objects.equals(getEquipoSeleccionado(), that.getEquipoSeleccionado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEquipoSeleccionado());
    }
    public void puntos (Partido.resultado){ //Según si gana pierde o empata el equipo elegido por el jugador
        puntaje = 0;                        // suma 3, 1 o 0 puntos a su puntaje
        Equipo ganador;                     // esto lo toma de la función resultado de la clase partido
        if (equipoSeleccionado() == Partido.resultado(ganador){
            puntaje += 3;
        }
        else if (Partido.resultado(ganador).equals("Empate"){
            puntaje += 1;
        }
        else {
            puntaje += 0;
        }
    }

    public Pronostico(Jugador IDjugador, Partido partido, int puntaje) {
        this.IDjugador = IDjugador;
        this.partido = partido;
        this.puntaje = puntaje;
    }

    public Jugador getIDjugador() {
        return IDjugador;
    }

    public void setIDjugador(Jugador IDjugador) {
        this.IDjugador = IDjugador;
    }
    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
