import java.util.LinkedList;
import java.util.Queue;

/**
 * Ejercicio 1: Comparación de colas
 * Descripcion: Escribir un método que reciba como argumentos dos colas del mismo tipo y devuelva true
 * si ambas colas son idénticas (mismo tamaño y mismos elementos en el mismo orden), o
 * false en caso contrario.
 * Objetivos: 
 *  • Aplicar estructuras de datos tipo cola.
 *  • Implementar recorrido y comparación de elementos.
 *  • Preservar el estado original de las colas (opcional con colas auxiliares).
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio1 {

        // Método que compara dos colas y preserva su contenido
    public static <T> boolean compararColas(Queue<T> cola1, Queue<T> cola2) {
        // Si los tamaños son diferentes, no pueden ser iguales
        if (cola1.size() != cola2.size()) {
            return false;
        }

        Queue<T> aux1 = new LinkedList<>();
        Queue<T> aux2 = new LinkedList<>();
        boolean sonIguales = true;

        // Comparar elemento por elemento
        while (!cola1.isEmpty() && !cola2.isEmpty()) {
            T elem1 = cola1.poll(); // desencolar
            T elem2 = cola2.poll();

            if (!elem1.equals(elem2)) {
                sonIguales = false;
            }

            aux1.add(elem1); // guardar copia para restaurar
            aux2.add(elem2);
        }

        // Restaurar las colas originales
        while (!aux1.isEmpty()) {
            cola1.add(aux1.poll());
            cola2.add(aux2.poll());
        }

        return sonIguales;
    }

    public static void main(String[] args) {
        Queue<Integer> colaA = new LinkedList<>();
        Queue<Integer> colaB = new LinkedList<>();

        colaA.add(10);
        colaA.add(20);
        colaA.add(30);

        colaB.add(10);
        colaB.add(20);
        colaB.add(30);

        boolean iguales = compararColas(colaA, colaB);

        System.out.println("¿Las colas son idénticas? " + iguales);

        System.out.println("Cola A después de comparar: " + colaA);
        System.out.println("Cola B después de comparar: " + colaB);
    }
    }
