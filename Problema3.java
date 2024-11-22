


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
            System.out.print("Dame Nomb:");
            nombreEmp = tcl.next();
            System.out.print("Dame los dias trabajados:");
            dia = tcl.nextInt();
            System.out.print("Valor del dia:");
            preciodia = tcl.nextDouble();
            
            System.out.println("NOMBRE\tDIAS\tVALORDIA\tVALORAPAGAR");
            System.out.println(nombreEmp+ "\t"+ dia + "\t"+ preciodia + "\t" + "\t" + (dia * preciodia));
            
            cont ++;
        }
    }
}
