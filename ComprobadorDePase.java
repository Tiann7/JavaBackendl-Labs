import java.util.Scanner;

public class ComprobadorDePase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu calificación:");
        double calificacion = scanner.nextDouble();

        String resultado = comprobarPase(calificacion);
        System.out.println(resultado);
    }

    public static String comprobarPase(double calificacion) {
        if (calificacion >= 60.0) {
            return "Aprobado.";
        } else {
            return "Reprobado.";
        }
    }
}
