import java.util.Stack;

/**
 * Ejercicio 1. Simulacion simple de pila
 * Objetivo: Practicar las operaciones basicas de push y pop en una pila.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();//Se crea la pila vacia
        //Se insertaran valores a la pila
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);
        pila.pop();
        pila.pop();
        
        System.out.println("Contenido actual: "+pila);
    }
    
}
