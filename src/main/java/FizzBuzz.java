public class FizzBuzz {
    public String getValor(int numero) {

        String resultado = "";

        if(numero % 3 == 0)
            resultado= "Fizz";

        if(numero % 5 == 0)
            resultado+="Buzz";

        if(resultado == "")
            resultado = String.valueOf(numero);

        return resultado;

    }
}
