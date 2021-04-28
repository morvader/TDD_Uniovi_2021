import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    @Test
    void NumeroDivisible3_Fizz() {
        int numero = 3;
        String resultadoEsperado = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();

        String resultado = fizzBuzz.getValor(numero);

        assertThat("No ha devuelto Fizz", resultado, is(resultadoEsperado));

    }
}
