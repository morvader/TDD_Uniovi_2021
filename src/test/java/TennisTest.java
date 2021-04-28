import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest {

    TennisGame tennisGame;

    @BeforeEach
    void setUp() {
        tennisGame = new TennisGame();
    }

    @Test
    void ComienzoJuego_NadaIguales() {
        String resultadoEsperado = "Nada Iguales";

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void PuntoJugador1_15Nada() {
        String resultadoEsperado = "15 Nada";
        this.setPuntuacion(1,0);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void PuntoJugador2_Nada15() {
        String resultadoEsperado = "Nada 15";
        this.setPuntuacion(0,1);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void DosPuntosCadaJugador_30Iguales() {
        String resultadoEsperado = "30 Iguales";
        this.setPuntuacion(2,2);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void CuatroPuntosCadaJugador_Deuce() {
        String resultadoEsperado = "Deuce";
        this.setPuntuacion(4,4);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void SeisPuntosCadaJugador_Deuce() {
        String resultadoEsperado = "Deuce";
        this.setPuntuacion(6,6);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }
    @Test
    void CincoPuntosJugador1CuatroJugador2_Ventaja1() {
        String resultadoEsperado = "Ventaja jugador1";
        this.setPuntuacion(5,4);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void SietePuntosJugador2SeisJugador1_Ventaja2() {
        String resultadoEsperado = "Ventaja jugador2";
        this.setPuntuacion(6,7);

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    private void setPuntuacion(int puntosJugador1, int puntosJugador2){
        for (int i = 0; i < puntosJugador1; i++) {
            tennisGame.puntoJugador1();
        }

        for (int i = 0; i < puntosJugador2; i++) {
            tennisGame.puntoJugador2();
        }
    }
}
