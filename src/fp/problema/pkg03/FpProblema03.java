
package fp.problema.pkg03;
import java.util.*;

public class FpProblema03 {

    /**3.Realizar un programa que calcule el factorial de un número dado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num,factorial=1; 
        Scanner leer=new Scanner(System.in); 
        System.out.print("Ingrese numero:"); 
        num=leer.nextInt(); 
            for(int i=1;i<=num;i++){ 
            factorial=factorial*i; 
          } 
            System.out.print("Factorial de "+num+"es"+factorial); 
     } 
}
