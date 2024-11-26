
/**
 *Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:

Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
 * @author PC
 */
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        String[] nombres = new String[100]; // Arreglo para los nombres
        String[] posiciones = new String[100]; // Arreglo para las posiciones
        int[] edades = new int[100]; // Arreglo para las edades
        double[] estaturas = new double[100]; // Arreglo para las estaturas
        
        int totalJugadores = 0; // Contador de jugadores
        int totalEdad = 0; // Suma total de edades
        double totalEstatura = 0.0; // Suma total de estaturas
        
        String nombre, posicion;
        int edad;
        double estatura;
        
        String cadenaAcumulada = ""; // Cadena de acumulación para el reporte
        

        do {

            System.out.print("Ingresa el nombre del jugador: ");
            nombre = tcl.nextLine();
            
            System.out.print("Ingresa la posicion del jugador: ");
            posicion = tcl.nextLine();
            
            System.out.print("Ingresa la edad del jugador: ");
            edad = tcl.nextInt();
            
            System.out.print("Ingresa la estatura del jugador (en metros): ");
            estatura = tcl.nextDouble();
            
            // Limpiar el buffer de la entrada para evitar problemas con el siguiente nextLine
            tcl.nextLine();
            
            // Guardar la información en los arreglos
            nombres[totalJugadores] = nombre;
            posiciones[totalJugadores] = posicion;
            edades[totalJugadores] = edad;
            estaturas[totalJugadores] = estatura;
            
            // Acumular para los promedios
            totalEdad += edad;
            totalEstatura += estatura;
            
            // Cadena de acumulación para el reporte
            cadenaAcumulada += String.format("%-5d %-20s %-15s %-10d %-10.2f\n", 
                                             totalJugadores + 1, 
                                             nombres[totalJugadores], 
                                             posiciones[totalJugadores], 
                                             edades[totalJugadores], 
                                             estaturas[totalJugadores]);
            
            totalJugadores++; // Incrementar el contador de jugadores
            
            // Preguntar si desea ingresar otro jugador
            System.out.print("Deseas ingresar otro jugador? (s/n): ");
            String continuar = tcl.nextLine();
            
            if (continuar.equalsIgnoreCase("n")) {
                break;
            }
            
        } while (true); // Continuar hasta que el usuario decida terminar
        
        double promedioEdad = (double) totalEdad / totalJugadores;
        double promedioEstatura = totalEstatura / totalJugadores;
        
        System.out.println("\nListado de Jugadores");
        System.out.printf("%-5s %-20s %-15s %-10s %-10s\n", "No.", "Nombre", "Posición", "Edad", "Estatura");
        System.out.println("---------------------------------------------------------------");
        
        System.out.println(cadenaAcumulada);

        System.out.printf("\nPromedio de edades: %.1f\n", promedioEdad);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstatura);
    }
}

