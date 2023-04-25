package Clases;

public class Ronda {
    private int numeroDeRonda;
    private Partido partido;

    public Ronda(int numeroDeRonda, Partido partido) {
        this.numeroDeRonda = numeroDeRonda;
        Partido Partido = partido;

    }
    int numeroRonda = 1;
    public Object ronda (Partido){
        while (numeroRonda<=4){
            numeroRonda+=1;
            return Partido.resultado;
        }
        return null;
    }
    public static int getNumeroDeRonda() {
        return numeroDeRonda;
    }

    public void setNumeroDeRonda(int numeroDeRonda) {
        this.numeroDeRonda = numeroDeRonda;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

}
