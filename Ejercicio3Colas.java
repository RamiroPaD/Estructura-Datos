import java.util.LinkedList;
import java.util.Queue;

/**
 * Ejercicio 3. Simulacion de atencion al cliente en supermercado Esperanza
 * Objetivos: Aplicar estructuras de cola y simulación temporal.
 *    • Implementar lógica condicional y aleatoria.
 *    • Generar estadísticas de rendimiento.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 04/Octubre/2025
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        final int DURACION = 420; // 7 horas = 420 minutos
        Queue<Integer> fila = new LinkedList<>();

        int cajasActivas = 3;
        boolean cuartaCajaAbierta = false;
        int totalAtendidos = 0;

        // Simulación minuto a minuto
        for (int minuto = 1; minuto <= DURACION; minuto++) {
            // Cada minuto llega un cliente
            fila.add(minuto);

            // Si hay más de 20 en la fila, abrimos la cuarta caja
            if (fila.size() > 20 && !cuartaCajaAbierta) {
                cajasActivas = 4;
                cuartaCajaAbierta = true;
                System.out.println("⚠️ Se abrió la cuarta caja en el minuto " + minuto);
            }

            // Cada caja puede atender a 1 cliente
            for (int i = 0; i < cajasActivas; i++) {
                if (!fila.isEmpty()) {
                    fila.poll(); 
                    totalAtendidos++;
                }
            }
        }

        // Mostrar resultados
        System.out.println("\n=== RESULTADOS DE LA SIMULACIÓN ===");
        System.out.println("🧍 Clientes atendidos: " + totalAtendidos);
        System.out.println("⏳ Clientes que quedaron esperando: " + fila.size());
        if (cuartaCajaAbierta)
            System.out.println("La cuarta caja fue abierta durante la simulación.");
        else
            System.out.println("La cuarta caja nunca se abrió.");
    }
    
}
