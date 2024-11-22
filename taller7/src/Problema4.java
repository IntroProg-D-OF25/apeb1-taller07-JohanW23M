
/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        String[] nombres = new String[100];
        String[] posiciones = new String[100];
        int[] edades = new int[100];
        double[] estaturas = new double[100];
        
        int totalJugadores = 0;
        int totalEdad = 0;
        double totalEstatura = 0.0;
        
        String nombre, posicion;
        int edad;
        double estatura;
        
        while (true) {
            System.out.print("Ingresa el nombre del jugador: ");
            nombre = tcl.nextLine();
            
            System.out.print("Ingresa la posicion del jugador: ");
            posicion = tcl.nextLine();
            
            System.out.print("Ingresa la edad del jugador: ");
            edad = tcl.nextInt();
            
            System.out.print("Ingresa la estatura del jugador (en metros): ");
            estatura = tcl.nextDouble();
            
            // Limpiar el buffer de la entrada
            tcl.nextLine();
            
            // Guardar la información del jugador en los arreglos
            nombres[totalJugadores] = nombre;
            posiciones[totalJugadores] = posicion;
            edades[totalJugadores] = edad;
            estaturas[totalJugadores] = estatura;
            
            // Acumular para el cálculo de promedios
            totalEdad += edad;
            totalEstatura += estatura;
            totalJugadores++;
            
            // Preguntar si el usuario desea continuar ingresando jugadores
            System.out.print("¿Deseas ingresar otro jugador? (s/n): ");
            String continuar = tcl.nextLine();
            if (continuar.equalsIgnoreCase("n")) {
                break; 
            }
        }
        
        double promedioEdad = (double) totalEdad / totalJugadores;
        double promedioEstatura = totalEstatura / totalJugadores;
        
        System.out.println("\nListado de Jugadores");
        
        System.out.printf("%-5s %-20s %-15s %-10s %-10s\n", "No.", "Nombre", "Posición", "Edad", "Estatura");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < totalJugadores; i++) {
            System.out.printf("%-5d %-20s %-15s %-10d %-10.2f\n", i + 1, nombres[i], posiciones[i], edades[i], estaturas[i]);
        }

        System.out.printf("\nPromedio de edades: %.1f\n", promedioEdad);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstatura);
    }
}
