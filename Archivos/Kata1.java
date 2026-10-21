import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido a 8 katas");

        System.out.print("Por favor ingrese el total de la cuenta:");
        double totalCuenta = scanner.nextDouble();

        System.out.print("Ingrese el monto de propina:");
        double montoPropina = scanner.nextDouble();

        if (totalCuenta <= 0) {
            System.out.println("El total de la cuenta es inválido, por favor intente de nuevo");
        } else if (montoPropina < 0 || montoPropina > 100) {
            System.out.println("El porcentaje de la propina es inválido, por favor intente de nuevo");
        } else {
            double propina = totalCuenta * montoPropina / 100;
            double totalPagar = totalCuenta + propina;

            System.out.println("Propina: $" + propina);
            System.out.println("Total a pagar: $" + totalPagar);

            if (montoPropina > 30) {
                System.out.println("¡Propina generosa!");
            } else if (montoPropina < 5) {
                System.out.println("Propina muy baja");
            }
        }

        scanner.close();
    }
}