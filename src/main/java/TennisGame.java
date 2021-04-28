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
        if(puntosJugador1 == puntosJugador2 && puntosJugador1 >= 4)
            return "Deuce";
        else if(puntosJugador1 == puntosJugador2)
            return this.puntoToString(puntosJugador1) + " Iguales";
        else if(puntosJugador1 >=4 && puntosJugador1 == puntosJugador2 + 1)
            return "Ventaja jugador1";
        else if(puntosJugador2 >=4 && puntosJugador2 == puntosJugador1 + 1)
            return "Ventaja jugador2";
        else
            return this.puntoToString(puntosJugador1) + " " + this.puntoToString(puntosJugador2);

        //return "";
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
