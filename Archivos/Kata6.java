import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a 8 katas");

        int totalClientes = 0;
        int contadorHoras = 0;
        int horaPico = -1;
        int maximoClientes = -1;
        int hora;
        int clientes;

        System.out.print("Por favor ingrese la hora (0-23, -1 para terminar): ");
        hora = scanner.nextInt();

        while (hora != -1) {
            if (hora < 0 || hora > 23) {
                System.out.println("La hora ingresada es inválida");
            } else {
                System.out.print("Por favor ingrese el número de clientes: ");
                clientes = scanner.nextInt();

                while (clientes < 0) {
                    System.out.println("El número de clientes no puede ser negativo.");
                    System.out.print("Por favor ingrese el número de clientes: ");
                    clientes = scanner.nextInt();
                }

                totalClientes = totalClientes + clientes;
                contadorHoras++;

                if (clientes > maximoClientes) {
                    maximoClientes = clientes;
                    horaPico = hora;
                }
            }

            System.out.print("Por favor ingrese la hora (0-23, -1 para terminar): ");
            hora = scanner.nextInt();
        }

        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");
        } else {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: "
                    + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico
                    + " (" + maximoClientes + " clientes)");
        }

        scanner.close();
    }
}