import java.util.Scanner;

public class beats {

    public static void main(String[] args) {
        //Calcular el número de pulsaciones
        //que una persona debe tener por cada
        //10segundos de ejercicio, si la fórmula es: 
        //... Numero de Pulsaciones = (220 - edad)/10
        //... Leer la edad e imprimir el número de pulsaciones.

	Scanner input = new Scanner(System.in);

        // Leer la edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        // Calcular el número de pulsaciones
        double pulsaciones = (220 - edad) / 10.0;

        // Imprimir el número de pulsaciones
        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio es: " + pulsaciones);
    }
}
