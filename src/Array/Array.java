
package Array;

import java.util.Scanner;

public class Array {
   
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad = 0, res, total = 0;
        System.out.print("Digiete cuántos números desea sumar: ");
        cantidad = entrada.nextInt();
        int arreglo[] = new int[cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite el número "+(i+1)+": ");
            res = entrada.nextInt();
            arreglo[i] = res;
            total += arreglo[i];
        }
        
        System.out.println("\nLa suma total es: "+total);
    }
}
