import java.util.LinkedList;
import java.util.Queue;

/**
 * Ejercicio 2: Simulación de supermercado con carritos y cajas
 * Descripción: Simular el funcionamiento de un supermercado con:
 *    • 25 carritos de compra.
 *    • 3 cajas de pago.
 *    • Clientes que:
 *          o Esperan si no hay carritos disponibles.
 *          o Se colocan en la cola de la caja con menos clientes.
 *          o No abandonan el supermercado.
 *          o Liberan el carrito al pagar.
 * Objetivos:
 *    • Modelar colas para carritos y cajas.
 *    • Aplicar lógica de asignación y liberación de recursos.
 *    • Simular comportamiento de clientes en tiempo discreto.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio2 {

    public static void main(String[] args) {
         // Creacion de cola de carritos
        Queue<Integer> carritos = new LinkedList<>();
        for (int i = 1; i <= 25; i++) {
            carritos.add(i);
        }

        // Creacion de cajas
        Queue<String> caja1 = new LinkedList<>();
        Queue<String> caja2 = new LinkedList<>();
        Queue<String> caja3 = new LinkedList<>();

        // Clientes
        String[] clientes = {"Ana", "Luis", "María", "José", "Lucía", "Carlos"};

        for (String cliente : clientes) {
            if (!carritos.isEmpty()) {
                int carrito = carritos.poll(); // tomar carrito

                // Buscar la caja con menos personas
                Queue<String> cajaMenosLlena = caja1;
                if (caja2.size() < cajaMenosLlena.size()) cajaMenosLlena = caja2;
                if (caja3.size() < cajaMenosLlena.size()) cajaMenosLlena = caja3;

                // El cliente se forma en esa caja
                cajaMenosLlena.add(cliente);
                System.out.println(cliente + " toma el carrito " + carrito +
                                   " y se forma en la caja " + obtenerNumeroCaja(cajaMenosLlena, caja1, caja2, caja3));

                // El cliente paga y devuelve el carrito
                cajaMenosLlena.poll();
                carritos.add(carrito);
                System.out.println(cliente + " termina y devuelve el carrito " + carrito + "\n");
            } else {
                System.out.println("No hay carritos disponibles, " + cliente + " espera...");
            }
        }

        // Mostrar resultado final
        System.out.println("Carritos disponibles al final: " + carritos.size());
    }

    // Método para identificar qué caja es
    private static int obtenerNumeroCaja(Queue<String> caja, Queue<String> c1, Queue<String> c2, Queue<String> c3) {
        if (caja == c1) return 1;
        if (caja == c2) return 2;
        return 3;
    }
    
}
