import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora del día (formato 24 horas): ");
        int hora = scanner.nextInt();

        String saludo = obtenerSaludo(hora);
        System.out.println(saludo);
    }

    public static String obtenerSaludo(int hora) {
        String saludo;

        if (hora >= 0 && hora < 12) {
            saludo = "Buenos días";
        } else if (hora >= 12 && hora < 18) {
            saludo = "Buenas tardes";
        } else if (hora >= 18 && hora < 24) {
            saludo = "Buenas noches";
        } else {
            saludo = "Hora no válida";
        }

        return saludo;
    }
}
