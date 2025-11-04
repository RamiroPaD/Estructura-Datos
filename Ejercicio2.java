import java.util.Scanner;
import java.util.Stack;

/**
 * Ejercicio 2. Pila de nombres
 * Objetivo: Prmitir al usuario ingresar nombres y mostrarlos en orden inverso. 
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String nombre;
        
        while(true){
            System.out.println("Ingrese nombres (Ingrese FIN para terminar):");
            nombre = sc.nextLine();
            
            if(nombre.equalsIgnoreCase("FIN"))
                break;
            pila.push(nombre);
        }
        System.out.println("nombres en orden inverso: ");
        while(!pila.empty()){
            System.out.println(pila.pop());
        }
        sc.close();
    }
    
}
