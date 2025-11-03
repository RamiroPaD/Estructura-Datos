Lista Enlazada de Palabras desde Archivo
/**
 *  *Objetivo: Desarrollar un programa que lea palabras desde un archivo de texto y las
 * almacene en una lista enlazada, permitiendo su manipulación dinámica
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */

//Esta es la clase Nodo
class Nodo {
    String palabra;
    Nodo siguiente;

    public Nodo(String palabra) {
        this.palabra = palabra;
        this.siguiente = null;
    }
}


class ListaEnlazada {
    Nodo cabeza = null;//Aqui inicia la lista

    // Agrega una palabra al final
    public void insertar(String palabra) {
        Nodo nuevo = new Nodo(palabra);
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

    // Elimina una palabra si existe
    public void eliminar(String palabra) {
        Nodo actual = cabeza;
        Nodo previo = null;

        while (actual != null) {
            if (actual.palabra.equals(palabra)) {
                if (previo == null) {
                    cabeza = actual.siguiente;
                } else {
                    previo.siguiente = actual.siguiente;
                }
                System.out.println("Palabra eliminada: " + palabra);
                return;
            }
            previo = actual;
            actual = actual.siguiente;
        }
        System.out.println("No se encontro la palabra: " + palabra);
    }

    // Muestra todas las palabras
    public void mostrar() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("(La lista está vacía)");
            return;
        }
        while (actual != null) {
            System.out.print(actual.palabra + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Guarda todas las palabras en el archivo
    public void guardar(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            Nodo actual = cabeza;
            while (actual != null) {
                writer.write(actual.palabra);
                if (actual.siguiente != null) writer.write(" ");
                actual = actual.siguiente;
            }
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
    }
}


public class Palabras {

    public static ListaEnlazada leerArchivo(String nombreArchivo) {
        ListaEnlazada lista = new ListaEnlazada();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String p : palabras) {
                    if (!p.isEmpty()) lista.insertar(p);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }
        return lista;
    }

    // Menú principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = "palabras.txt";
        ListaEnlazada lista = leerArchivo(nombreArchivo);

        int opcion;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Ver palabras");
            System.out.println("2. Agregar palabra");
            System.out.println("3. Eliminar palabra");
            System.out.println("4. Guardar y salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Palabras en la lista:");
                    lista.mostrar();
                    break;
                case 2:
                    System.out.print("Palabra a agregar: ");
                    String nueva = sc.nextLine();
                    lista.insertar(nueva);
                    break;
                case 3:
                    System.out.print("Palabra a eliminar: ");
                    String eliminar = sc.nextLine();
                    lista.eliminar(eliminar);
                    break;
                case 4:
                    lista.guardar(nombreArchivo);
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
