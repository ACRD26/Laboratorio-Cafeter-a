import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a 8 katas");

        System.out.print("Por favor ingrese un día (1=Lunes, 7=Domingo): ");
        int dia = scanner.nextInt();

        System.out.print("Por favor ingrese la hora (0-23): ");
        int hora = scanner.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Por favor intentelo de nuevo, el dia ingresado es inválido");
        } else if (hora < 0 || hora > 23) {
            System.out.println("Por favor intentelo de nuevo, la hora ingresada es inválida");
        } else {
            switch (dia) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    if (hora >= 6 && hora < 20) {
                        System.out.println("La cafetería está abierta.");
                    } else {
                        System.out.println("La cafetería está cerrada.");
                    }
                    System.out.println("Horario: 6:00 AM - 8:00 PM");
                    break;

                case 6:
                    if (hora >= 7 && hora < 14) {
                        System.out.println("La cafetería está abierta.");
                    } else {
                        System.out.println("La cafetería está cerrada.");
                    }
                    System.out.println("Horario: 7:00 AM - 2:00 PM");
                    break;

                case 7:
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("Horario de domingo: cerrado todo el día");
                    break;
            }
        }

        scanner.close();
    }
}