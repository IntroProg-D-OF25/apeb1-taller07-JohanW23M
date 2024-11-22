
/**
 *Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10, 2/11, 3/12, 4/13,5/14, 6/15

 */
import java.util.Scanner;
public class Problema1_SerieNumero1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        int limite, cont = 1;
        System.out.println("Dame el limite");
        limite = tcl.nextInt();
        while (cont <= limite){
            System.out.println(cont + "/" + (cont + 9));
            cont ++;
        }
    }
}
/**
 * debug:
Dame el limite
5
1/10
2/11
3/12
4/13
5/14
BUILD SUCCESSFUL (total time: 2 seconds)
 */