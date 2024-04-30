import java.util.Scanner;

public class CalculadoraDeRangoDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu edad:");
        int edad = scanner.nextInt();

        String rangoEdad = calcularRangoEdad(edad);
        System.out.println("Tu rango de edad es: " + rangoEdad);
    }

    public static String calcularRangoEdad(int edad) {
        String rango;
        if (edad >= 0 && edad <= 12) {
            rango = "Infancia";
        } else if (edad >= 13 && edad <= 19) {
            rango = "Adolescencia";
        } else if (edad >= 20 && edad <= 39) {
            rango = "Juventud";
        } else if (edad >= 40 && edad <= 59) {
            rango = "Adultez intermedia";
        } else if (edad >= 60) {
            rango = "Adultez mayor";
        } else {
            rango = "Edad no válida";
        }
        return rango;
    }
}
