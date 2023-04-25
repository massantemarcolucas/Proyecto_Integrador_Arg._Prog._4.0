package Clases;

public class Ronda { // Creo que está mal, debería tomar varios partidos que pertenecen a la 1ra ronda, los ganadores...
    private int numeroDeRonda; // ... deberían ir a una 2da ronda. Después semifinales y la final.
    private Partido partido;

    public Ronda(int numeroDeRonda, Partido partido) {
        this.numeroDeRonda = numeroDeRonda;
        Partido Partido = partido;

    }
    int numeroRonda = 1; //la ronda toma un partido y lo ejecuta, luego suma 1 a numeroRonda
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
