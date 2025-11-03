/**
 * En este codigo se realizo la actividad numero uno de los Ejercicios practicos numero Actividad 05: Lista Doblemente Enlazada de Caracteres 
 * Objetivo: Desarrollar un programa que construya una lista doblemente enlazada a partir de los 
 * caracteres de una cadena ingresada por el usuario, y que luego ordene dicha lista 
 * alfabéticamente para mostrarla en pantalla. 
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */

class Nodo {
    char caracter;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(char caracter) {
        this.caracter = caracter;
        this.anterior = null;
        this.siguiente = null;
    }
}

class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    public void insertarFinal(char c) {
        Nodo nuevo = new Nodo(c);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.caracter);
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void ordenar() {
        if (cabeza == null) return;

        boolean cambiado;
        do {
            cambiado = false;
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                if (actual.caracter > actual.siguiente.caracter) {
                    // Intercambiamos caracteres para ordenar
                    char temp = actual.caracter;
                    actual.caracter = actual.siguiente.caracter;
                    actual.siguiente.caracter = temp;
                    cambiado = true;
                }
                actual = actual.siguiente;
            }
        } while (cambiado);
    }
}

public class Caracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            lista.insertarFinal(texto.charAt(i));
        }

        System.out.println("Lista original:");
        lista.mostrar();

        lista.ordenar();

        System.out.println("Lista ordenada:");
        lista.mostrar();

        scanner.close();
    }
}
