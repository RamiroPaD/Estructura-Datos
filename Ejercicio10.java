import java.util.Stack;

/**
 ** Ejercicio 10. Verificar palindromo
 * Objetivo: Verificar si una palabra es palindromo utilizando una pila
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        // Convertimos todo a minúsculas para evitar diferencias por mayúsculas/minúsculas
        palabra = palabra.toLowerCase();

        // Apila caracteres
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        // Desapila para formar la palabra invertida
        String invertida = "";
        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        // Realiza una comparacion de las palabras
        if (palabra.equals(invertida)) {
            System.out.println("La palabra ES palíndroma.");
        } else {
            System.out.println("La palabra NO es palíndroma.");
        }

        sc.close();
    }
    
}
