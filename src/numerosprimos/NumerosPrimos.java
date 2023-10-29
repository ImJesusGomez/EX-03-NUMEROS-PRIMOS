package numerosprimos;

import java.io.*;

public class NumerosPrimos {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Dame un numero");
        int n = Integer.parseInt(teclado.readLine());

        System.out.println("El numero " + n + " " + numerosPrimos(n));

    }

    public static String numerosPrimos(int n) {

        String esNumeroPrimo = "";

        if (n > 1) {
            if (n % 2 != 0 || n == 2) {
                esNumeroPrimo = "Es numero primo";
            } else {
                esNumeroPrimo = "No es numero primo";
            }
        } else {
            esNumeroPrimo = "No es numero primo";
        }

        return esNumeroPrimo;
    }

}
