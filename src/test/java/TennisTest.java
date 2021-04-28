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
        tennisGame.puntoJugador1();

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void PuntoJugador2_Nada15() {
        String resultadoEsperado = "Nada 15";
        tennisGame.puntoJugador2();

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }

    @Test
    void DosPuntosCadaJugador_30Iguales() {
        String resultadoEsperado = "30 Iguales";
        tennisGame.puntoJugador1();
        tennisGame.puntoJugador1();
        tennisGame.puntoJugador2();
        tennisGame.puntoJugador2();

        String resultado = tennisGame.getPuntuacion();

        assertThat(resultado, equalTo(resultadoEsperado));
    }
}
