import java.util.Scanner;
import java.util.Stack;

/**
 ** Ejercicio 6. Decimal a binario
 * Objetivo: Convertir numero decimal a binario usando una pila.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Stack<Integer> pila = new Stack<>();
       System.out.print("Ingrese el numero: ");
       int numero = sc.nextInt();
       
       while(numero > 0){
           pila.push(numero % 2);
           numero /= 2;
           
       }
       System.out.print("Numero Binario: ");
       while(!pila.isEmpty()){
           System.out.print(pila.pop());
       }
       System.out.println();
       sc.close();
    }
    
}
