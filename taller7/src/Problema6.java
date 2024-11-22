

/**
 * *
Una empresa de comercialización de computadoras realiza el proceso de venta
* haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento 
* del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de 
* cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: por 
* cada venta preguntar los siguiente datos:

Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra
* computadora con precio $100
 * @author UTPL
 */

import java.util.Scanner;


public class Problema6 {
     public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nombre;
        double  cont = 1, subtotal, costo;
        int tipocliente;
        
        while (cont <= 7)
        {
            System.out.print("Dame el Nombre del cliente: ");
            nombre = tcl.next();
            System.out.print("Costo de la computadora: ");
            costo = tcl.nextDouble();
            System.out.print("Tipo de cliente (1 / 2): ");
            tipocliente = tcl.nextInt();
            subtotal = costo;
            if (tipocliente == 1){
            costo *= 0.90;
            }
            else 
            {
            costo *= 0.80;
            }
            System.out.println("NOMBRE\tPRECIO\tTIPOCLIENTE\tTOTALAPAGAR");
            System.out.println(nombre+ "\t"+ subtotal + "\t"+ tipocliente + "\t" + "\t" + costo);
            
            cont ++;
        }
         System.out.println("");
    }
}
/**
 * debug:
Dame el Nombre del cliente: Joaquin
Costo de la computadora: 1000
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
Joaquin	1000.0	1		900.0
Dame el Nombre del cliente: Alicia
Costo de la computadora: 900
Tipo de cliente (1 / 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
Alicia	900.0	2		720.0
Dame el Nombre del cliente: Pedro
Costo de la computadora: 1200
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
Pedro	1200.0	1		1080.0

*Dame el Nombre del cliente: Daniel
Costo de la computadora: 500
Tipo de cliente (1 / 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
Daniel	500.0	2		400.0
Dame el Nombre del cliente: Klever
Costo de la computadora: 600
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
Klever	600.0	1		540.0
Dame el Nombre del cliente: Elias
Costo de la computadora: 2000
Tipo de cliente (1 / 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
Elias	2000.0	2		1600.0
* BUILD SUCCESSFUL (total time: 1 minute 4 seconds)

 */