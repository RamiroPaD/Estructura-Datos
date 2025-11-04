import java.util.Stack;

/**
 * Ejercicio 3. verificar si una pila esta vacia
 * Objetivo: Comprobar si la pila tiene elementos.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       Stack<Integer> pila = new Stack<>();//Se crea una pila vacia
       // Verifica si la pila esta vacia y mandara "true" si no tiene 
       //nada 
       System.out.println("La pila se encuentra vacia: "+ pila.empty());
       // Se insertar un valor a la pila
       pila.push(3);
       // Verifica si la pila esta vacia y mandara "false" si no lo 
       //esta
    
       System.out.println("la pila se encuentra vacia: "+ pila.empty());
       
    }
}
