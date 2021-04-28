public class TennisGame {
    int puntosJugador1;
    int puntosJugador2;

    public TennisGame() {
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
    }

    public void puntoJugador1(){
        this.puntosJugador1++;
    }

    public void puntoJugador2(){
        this.puntosJugador2++;
    }

    public String getPuntuacion() {
        if(puntosJugador1 == puntosJugador2)
            return this.puntoToString(puntosJugador1) + " Iguales";
        if(puntosJugador1 == 1 && puntosJugador2 == 0)
            return "15 Nada";

        return "";
    }

    private String puntoToString(int puntuacion){
        switch (puntuacion){
            case 0:
                return "Nada";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
        }

        return "";
    }
}
