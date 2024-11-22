
/**
 *Generar un programa Java que permita ingresar 4 estudiantes; por cada
 * uno de ellos ingresar el nombre del estudiante, el promedio de ciclo.
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
Estudiante 2	6.9	Reprobado
Estudiante 3	7	Aprobado
Estudiante 4	5	Reprobado
 Atención; con base al valor del promedio,usted debe asignar
 * en cada registro el tipo Aprobado o Reprobado.
 * @author UTPL
 */
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nombreEst, estado;
        double promedio, cont = 1;
        while (cont <= 4)
        {
            System.out.println("Dame Nomb y Promedio:");
            nombreEst = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio >= 7)? "APROBADO":"REPROBADO";
            System.out.println("NOMBRE\tPROMEDIO\tESTADO");
            System.out.println(nombreEst + "\t"+ promedio+ "\t" + estado);
            
            cont ++;
        }
    }
}
/**
 * debug:
Dame Nomb y Promedio:
Juan
7,5
NOMBRE	PROMEDIO	ESTADO
Juan	7.5	APROBADO
Dame Nomb y Promedio:
Francisco
6,76
NOMBRE	PROMEDIO	ESTADO
Francisco	6.76	REPROBADO
Dame Nomb y Promedio:
Alex
8,90
NOMBRE	PROMEDIO	ESTADO
Alex	8.9	APROBADO
Dame Nomb y Promedio:
Juan
2,4
NOMBRE	PROMEDIO	ESTADO
Juan	2.4	REPROBADO
BUILD SUCCESSFUL (total time: 1 minute 1 second)
 */