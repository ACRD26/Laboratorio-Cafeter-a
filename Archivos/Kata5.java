import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a 8 katas");

        int opcion = 0;
        int total = 0;

        while (opcion != 6) {
            System.out.println("\n--- Menú de la Cafetería ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");

            System.out.print("Por favor ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total = total + 4000;
                    System.out.println("El producto fue agregado: Café ($4.000)");
                    break;

                case 2:
                    total = total + 3500;
                    System.out.println("El producto fue agregado: Muffin ($3.500)");
                    break;

                case 3:
                    total = total + 7500;
                    System.out.println("El producto fue agregado: Sandwich ($7.500)");
                    break;

                case 4:
                    total = total + 5000;
                    System.out.println("El producto fue agregado: Jugo ($5.000)");
                    break;

                case 5:
                    total = total + 3000;
                    System.out.println("El producto fue agregado: Té ($3.000)");
                    break;

                case 6:
                    System.out.println("Valor a pagar: $" + total);
                    break;

                default:
                    System.out.println("Intentelo de nuevo, la opción ingresada no existe");
                    break;
            }
        }

        scanner.close();
    }
}