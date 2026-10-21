import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a 8 katas");

        System.out.print("Por favor ingrese el nombre de la bebida: ");
        String nombreBebida = scanner.nextLine();

        System.out.print("Por favor ingrese la temperatura en Celsius: ");
        double temperatura = scanner.nextDouble();

        String clasificacion;

        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura >= 30 && temperatura <= 60) {
            clasificacion = "Templada";
        } else if (temperatura < 30){
            clasificacion = "Fría";
        }else{
            clasificacion = "Error";
        }

        System.out.println(nombreBebida + ": " + clasificacion);

        scanner.close();
    }
}
