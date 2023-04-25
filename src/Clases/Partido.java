package Clases;

import java.util.Objects;

public class Partido {
    public static Object resultado;
    private int golesEquipoA;
    private int golesEquipoB;
    static Equipo equipoA;
    static Equipo equipoB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Partido partido)) return false;
        return getGolesEquipoA() == partido.getGolesEquipoA() && getGolesEquipoB() == partido.getGolesEquipoB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGolesEquipoA(), getGolesEquipoB());
    }
    String ganador = "";
    public static Object resultado(Equipo ganador){
        if (golesEquipoA > golesEquipoB){
            ganador = equipoA.getNombre();
            return  ganador;
        }
        else if (golesEquipoA < golesEquipoB) {
            ganador = equipoB.getNombre();
            return ganador;
        }
        else {
            ganador = "Empate";
            return ganador;
        }
    }
    // Constructor
    public Partido (Equipo equipoA, Equipo equipoB, int golesEquipoA, int golesEquipoB){
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = golesEquipoA;
        this.golesEquipoB = golesEquipoB;
    }
    public static Equipo getEquipoA() {
        return equipoA;
    }

    public static void setEquipoA(Equipo equipoA) {
        equipoA = equipoA;
    }

    public static Equipo getEquipoB() {
        return equipoB;
    }

    public static void setEquipoB(Equipo equipoB) {
        equipoB = equipoB;
    }

    public int getGolesEquipoA() {
        return golesEquipoA;
    }

    public void setGolesEquipoA(int golesEquipoA) {
        golesEquipoA = golesEquipoA;
    }

    public int getGolesEquipoB() {
        return golesEquipoB;
    }

    public void setGolesEquipoB(int golesEquipoB) {
        golesEquipoB = golesEquipoB;
    }


}
