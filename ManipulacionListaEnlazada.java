/**
 *
 * @author Ramiro Padierna Delgado 
 * @author 1224100710.rpd@gmail.com
 * En este codigo se realizo la actividad numero uno de los Ejercicios practicos numero Actividad 01: Manipulación de Lista Enlazada  
 * Objetivo: Desarrollar un programa que implemente operaciones basicas sobre una lista enlazada
 * simple de numeros enteros positivos
 */

public class Lista {

  
    static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

   
    Nodo cabeza;

    // Insertar Nodo al final
    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Mostrara la lista
    public void mostrarLista() {
        Nodo actual = cabeza;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Eliminar nodos que sean mayores a los inserte un numero
    public void eliminarMayoresA(int limite) {
        while (cabeza != null && cabeza.dato > limite) {
            cabeza = cabeza.siguiente;
        }

        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato > limite) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
    }

   
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Insertara 10 nodos aleatoriamente 
        for (int i = 0; i < 10; i++) {
            int numero = rand.nextInt(100) + 1; 
            lista.insertarAlFinal(numero);
        }

        // Imprime la lista 
        System.out.println("Lista generada:");
        lista.mostrarLista();

        // Leer valor límite
        System.out.print("Ingrese un valor límite: ");
        int limite = scanner.nextInt();

        // Eliminar nodos que son mayores
        lista.eliminarMayoresA(limite);

        // Esta parte imprimira la lista al final
        System.out.println("Lista después de eliminar nodos mayores a " + limite + ":");
        lista.mostrarLista();

        scanner.close();
    }
}
