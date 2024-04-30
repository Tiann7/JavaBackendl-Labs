import java.util.Scanner;

public class ClasificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un número:");
        double numero = scanner.nextDouble();

        String resultado = clasificarNumero(numero);
        System.out.println(resultado);
    }

    public static String clasificarNumero(double numero) {
        if (numero > 0) {
            return "El número es positivo.";
        } else if (numero < 0) {
            return "El número es negativo.";
        } else {
            return "El número es cero.";
        }
    }
}
