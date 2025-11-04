import java.util.Scanner;
import java.util.Stack;

/**
 ** Ejercicio 8. Evaluar expresion postfija
 * Objetivo: Evaluar notacion polaca inversa con una pila.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio8 {

   public static int evaluar(String expr) {
    Stack<Integer> pila = new Stack<>();
        for (String token : expr.split(" ")) {
          if (token.matches("\\d+")){
              pila.push(Integer.parseInt(token));
                 }else{
                   int b = pila.pop(), a = pila.pop();
             switch (token) {
                case "+": pila.push(a + b); 
                    break;
                case "-": pila.push(a - b); 
                    break;
                case "*": pila.push(a * b); 
                    break;
                case "/": pila.push(a / b); 
                    break;
                }
            }
        }
        return pila.pop();
    }
        public static void main(String[] args) {
            System.out.println(evaluar("5 3 + 8 2 - *"));
 }
}
