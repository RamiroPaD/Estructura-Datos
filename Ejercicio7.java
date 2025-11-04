import java.util.Scanner;
import java.util.Stack;

/**
 ** Ejercicio 7. Simular funcion Deshacer (Undo)
 * Objetivo: Implementar acciones y deshacer la ultima con una pila
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Stack<String> pila = new Stack<>();
       
       while (true) {
       System.out.print("Acción (UNDO/FIN): ");
        String act = sc.nextLine();
        if (act.equalsIgnoreCase("FIN")) 
            break;
         if (act.equalsIgnoreCase("UNDO")) {
              if (!pila.isEmpty()) 
                  pila.pop();
       } else {
           pila.push(act);
    }
 System.out.println("Actual: " + pila);

    }   
  }
}
