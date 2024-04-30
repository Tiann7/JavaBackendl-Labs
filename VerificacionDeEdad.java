import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (esMayorDeEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
