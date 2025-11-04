import java.util.Scanner;
import java.util.Stack;

/**
 * Ejercicio 5. Balanceo de parentesis.
 * Objetivo: Verificar si los parentisis estan correctamente balanceados
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio5 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingrese una expresión: ");
        String expresion = sc.nextLine();

        boolean balanceada = true; // bandera para verificar el estado

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    balanceada = false; // hay un ')' sin '(' previo
                    break;
                } else {
                    pila.pop();
                }
            }
        }

        // Si la pila no está vacía, hay más '(' que ')'
        if (!pila.isEmpty()) {
            balanceada = false;
        }

        if (balanceada) {
            System.out.println("La expresión está balanceada.");
        } else {
            System.out.println("La expresión NO está balanceada.");
        }

        sc.close();
    }
    
}
