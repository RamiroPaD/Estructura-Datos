import java.util.Scanner;
import java.util.Stack;

/**
 * Ejercicio 4. Invertir una palabra
 * Objetivo: Invertir una palabra usando una pila de caracteres.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Se crea una pila vacia
       Stack<Character> pila = new Stack<>();
       
       //Pide igresar la palabra
       System.out.print("Ingrese la palabra: ");
       String palabra = sc.nextLine();
       
       //Apila cada caracter
       for(int i = 0; i < palabra.length(); i++){
           pila.push(palabra.charAt(i));
       }
       System.out.println("Palabra invertida: ");
       //Desapila cada caracter
       while(!pila.empty()){
           System.out.print(pila.pop());
       }
       System.out.println();
       sc.close();
    }
    
}
