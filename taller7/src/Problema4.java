
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

        String nombre, posicion, continuar;
        int edad;
        double estatura;
        int totalJugadores = 0; // Contador de jugadores
        int totalEdad = 0; // Suma total de edades
        double totalEstatura = 0.0; // Suma total de estaturas

        System.out.println("Desea ingresar un jugador? (s/n)");
        continuar = tcl.next();  
        tcl.nextLine();  // Limpiar el buffer del salto de línea

        while (continuar.equals("s")) {
            // Solicitar los datos del jugador
            System.out.print("Ingresa el nombre del jugador: ");
            nombre = tcl.next(); 
            System.out.print("Ingresa la posicion del jugador: ");
            posicion = tcl.next(); 

            System.out.print("Ingresa la edad del jugador: ");
            edad = tcl.nextInt();  // Leer la edad

            System.out.print("Ingresa la estatura del jugador (en metros): ");
            estatura = tcl.nextDouble();  // Leer la estatura

        
            tcl.nextLine();  // Limpiar el buffer para la próxima entrada de nextLine()

            // Acumular los totales
            totalEdad += edad;
            totalEstatura += estatura;
            totalJugadores++; // Incrementar el contador de jugadores

            // Imprimir los datos del jugador
            System.out.printf("%-5d %-20s %-15s %-10d %-10.2f\n",
                    totalJugadores, nombre, posicion, edad, estatura);

            // Preguntar si desea ingresar otro jugador
            System.out.print("Deseas ingresar otro jugador? (s/n): ");
            continuar = tcl.next();  // Leer la respuesta
            tcl.nextLine();  // Limpiar el buffer nuevamente
        }

  
            System.out.printf("\nPromedio de edades: %.1f\n", (totalEdad / (double) totalJugadores));
            System.out.printf("Promedio de estaturas: %.2f\n", (totalEstatura / totalJugadores));
  
    }
}
/**
debug:
Desea ingresar un jugador? (s/n)
s
Ingresa el nombre del jugador: Jose Perez
Ingresa la posicion del jugador: delantero
Ingresa la edad del jugador: 18
Ingresa la estatura del jugador (en metros): 1,78
1     Jose Perez           delantero       18         1,78      
Deseas ingresar otro jugador? (s/n): s
Ingresa el nombre del jugador: Pedro Lopez
Ingresa la posicion del jugador: defenza
Ingresa la edad del jugador: 23
Ingresa la estatura del jugador (en metros): 1,90
2     Pedro Lopez          defenza         23         1,90      
Deseas ingresar otro jugador? (s/n): n

Promedio de edades: 20,5
Promedio de estaturas: 1,84
BUILD SUCCESSFUL (total time: 1 minute 16 seconds)
 */
