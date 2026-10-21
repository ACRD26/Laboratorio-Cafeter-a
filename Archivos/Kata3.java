import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a 8 katas");

        double subtotal = 0;
        double precio;

        System.out.print("Por favor Ingrese el precio del producto (0 para terminar): ");
        precio = scanner.nextDouble();

        while (precio != 0) {
            subtotal = subtotal + precio;

            System.out.print("Por favor Ingrese el precio del producto (0 para terminar): ");
            precio = scanner.nextDouble();
        }

        double iva = subtotal * 0.19;
        double totalIVA = subtotal + iva;
        double descuento = 0;
        double totalFinal = totalIVA;

        if (totalIVA > 50000) {
            descuento = totalIVA * 0.10;
            totalFinal = totalIVA - descuento;
        }

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total con IVA: $" + totalIVA);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

        scanner.close();
    }
}