import java.util.Stack;

/**
 ** Ejercicio 9. Revertir lista.
 * Objetivo: Usar pila para invertir los elementos de una lista
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio9 {

    public static void main(String[] args) {
       Stack<Integer> pila = new Stack<>();
       int[] numeros = {1,2,3,4};
       
       
       for(int n: numeros) 
           pila.push(n);
        System.out.print("Lista invertida: ");
        
        while(!pila.isEmpty())
            System.out.print(pila.pop()+ " ");
    }
    
}
