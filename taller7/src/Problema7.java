
/**
 *Generar e imprimir la siguiente serie:

sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author UTPL
 */

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, cont = 1;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt(); 
        
        while (cont <= limite) {
            // Si el contador es impar, imprimimos el signo negativo
            if (cont % 2 != 0) {
                System.out.print("-(" + "1/" + cont + ")");
            } else {
                // Si el contador es par, imprimimos el signo positivo
                System.out.print(" + (1/" + cont + ")");
            }
            cont++;  
        }
        System.out.println();  
    }
}

/**
 * debug:
Dame el limite: 10
-(1/1) + (1/2)-(1/3) + (1/4)-(1/5) + (1/6)-(1/7) + (1/8)-(1/9) + (1/10)
BUILD SUCCESSFUL (total time: 5 seconds)

 */