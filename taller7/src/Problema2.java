/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
  	5/10, 10/12 ,15/14, 20/16, 25/18, 30/20
 */
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        int limite, cont = 5, multi = 10;
        System.out.println("Dame el limite");
        limite = tcl.nextInt();
        while (cont <= (limite * 5)){
            System.out.println(cont + "/" + multi);
            cont +=5;
            multi +=2;
        }
    }

}
/**
 * debug:
Dame el limite
5
5/10
10/12
15/14
20/16
25/18
BUILD SUCCESSFUL (total time: 4 seconds)

 */