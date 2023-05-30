package JavaDeveloperDio.src;

//Calculadora
public class Aula2 {
    /**
     * @author Ariel Pellegrino
     * @version 1.0
     * @since 29/05/2023
     * Este método é utilizado para somar dois números inteiros.
     * @param numeroUm este é o primeiro parametro do método.
     * @param numeroDois este é o segundo parametro do método.
     * @return int o resultado deste método é a soma dos dois numeros.
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0;
        if (m == "M") { //M = multiplicação
            r = n * x;
        } else {
            r = n + x;
        }
        return r;
    }
}