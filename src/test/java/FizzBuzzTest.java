import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void NumeroDivisible3_Fizz() {
        int numero = 3;
        String resultadoEsperado = "Fizz";

        String resultado = fizzBuzz.getValor(numero);

        assertThat("No ha devuelto Fizz", resultado, is(resultadoEsperado));

    }

    @Test
    void NumeroDivisible5_Bizz() {
        int numero = 5;
        String resultadoEsperado = "Buzz";

        String resultado = fizzBuzz.getValor(numero);

        assertThat("No ha devuelto Buzz", resultado, is(resultadoEsperado));

    }

    @Test
    void NumeroDivisible3y5_FizzBizz() {
        int numero = 15;
        String resultadoEsperado = "FizzBuzz";

        String resultado = fizzBuzz.getValor(numero);

        assertThat("No ha devuelto FizzBuzz", resultado, is(resultadoEsperado));

    }
    @Test
    void NumeroNormal_Numero() {
        int numero = 1;
        String resultadoEsperado = "1";

        String resultado = fizzBuzz.getValor(numero);

        assertThat("No ha devuelto el numero", resultado, is(resultadoEsperado));

    }
}
