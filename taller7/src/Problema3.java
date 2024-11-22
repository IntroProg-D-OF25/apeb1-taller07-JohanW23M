


/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo 
 * del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado.
 * Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24
 * @author UTPL
 */
import java.util.Scanner;
public class Problema3 {
        public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nombreEmp;
        double  cont = 1, preciodia;
        int dia;
        
        while (cont <= 5)
        {
            System.out.print("Ingresa el nombre del trabajador: ");
            nombreEmp = tcl.next();
            System.out.print("Ingresa los dias trabajados: ");
            dia = tcl.nextInt();
            System.out.print("Valor del dia: ");
            preciodia = tcl.nextDouble();
            
            System.out.println("NOMBRE\tDIAS\tVALORDIA\tVALORAPAGAR");
            System.out.println(nombreEmp+ "\t"+ dia + "\t"+ preciodia + "\t" + "\t" + (dia * preciodia));
            
            cont ++;
        }
        System.out.println("");
    }
}

/**
 * debug:
Ingresa el nombre del trabajador: Johan
Ingresa los dias trabajados: 6
Valor del dia: 2,4
NOMBRE	DIAS	VALORDIA	VALORAPAGAR
Johan	6	2.4		14.399999999999999
Ingresa el nombre del trabajador: Julio
Ingresa los dias trabajados: 20
Valor del dia: 5
NOMBRE	DIAS	VALORDIA	VALORAPAGAR
Julio	20	5.0		100.0
Ingresa el nombre del trabajador: Pedro
Ingresa los dias trabajados: 30
Valor del dia: 10
NOMBRE	DIAS	VALORDIA	VALORAPAGAR
Pedro	30	10.0		300.0
Ingresa el nombre del trabajador: Franco
Ingresa los dias trabajados: 3
Valor del dia: 5,55
NOMBRE	DIAS	VALORDIA	VALORAPAGAR
Franco	3	5.55		16.65
Ingresa el nombre del trabajador: Josr
Ingresa los dias trabajados: 7
Valor del dia: 3,67
NOMBRE	DIAS	VALORDIA	VALORAPAGAR
Josr	7	3.67		25.689999999999998

BUILD SUCCESSFUL (total time: 1 minute 39 seconds)

 */