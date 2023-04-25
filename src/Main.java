import Clases.Equipo;
import Clases.Jugador;

public class Main {
    public static void main(String[] args) {
        // Los equipos deberian estar en un array de equipos
        Equipo equipo1 = new Equipo("Argentina", "Selección argentina");
        Equipo equipo2 = new Equipo("Brazil", "Selección brasilera");
        Equipo equipo3 = new Equipo("Uruguay", "Selección uruguaya");
        Equipo equipo4 = new Equipo("Paraguay", "Selección paraguaya");
        Equipo equipo5 = new Equipo("Chile", "Selección chilena");
        Equipo equipo6 = new Equipo("México", "Selección mexicana");
        Equipo equipo7 = new Equipo("Venezuela", "Selección venezolana");
        Equipo equipo8 = new Equipo("Colombia", "Selección colombiana");

        Jugador jugador1 = new Jugador("José",1);
        Jugador jugador2 = new Jugador("pepe",2);
    }
}