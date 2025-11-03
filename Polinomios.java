/**
 * En este codigo se realizo la actividad numero uno de los Ejercicios practicos numero Actividad 03: Representacion y Evaluacion de Polinomios con Listas Enlazadas
 * Objetivo: Desarrollar un programa que permita representar polinomios mediante una lista enlazada 
 * simple y calcular sus valores para distintos puntos de evaluación.
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */


// Clase Nodo
class Nodo {
    double coeficiente;
    int exponente;
    Nodo siguiente;

    public Nodo(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }
}

// Clase ListaPolinomio aqui se maneja la lista enlazada
class ListaPolinomio {
    private Nodo cabeza;

    // Aqui se insertar un nuevo término al final
    public void insertar(double coef, int exp) {
        Nodo nuevo = new Nodo(coef, exp);
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

    public void mostrar() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("El polinomio está vacío.");
            return;
        }

        System.out.print("P(x) = ");
        while (actual != null) {
            System.out.print(actual.coeficiente + "x^" + actual.exponente);
            if (actual.siguiente != null && actual.siguiente.coeficiente >= 0) {
                System.out.print(" + ");
            } else if (actual.siguiente != null) {
                System.out.print(" ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public double evaluar(double x) {
        double resultado = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        }
        return resultado;
    }

    //Se muestra la tabla
    public void tablaValores() {
        System.out.println("\n x\t|\tP(x)");
        System.out.println("-------------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            System.out.printf(" %.1f\t|\t%.4f\n", x, evaluar(x));
        }
    }
}

public class Polinomios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaPolinomio poli = new ListaPolinomio();

        System.out.println("=== REPRESENTACIÓN DE POLINOMIOS ===");
        System.out.println("Ingrese los términos como pares (coeficiente y exponente).");
        System.out.println("Ejemplo para 3x^4 -4x^2 +11: escriba 3 4, luego -4 2, luego 11 0.");
        System.out.println("Escriba 'q' cuando desee terminar.\n");

        while (true) {
            System.out.print("Coeficiente (o 'q' para salir): ");
            String entrada = sc.next();
            if (entrada.equalsIgnoreCase("q")) break;

            double coef = Double.parseDouble(entrada);
            System.out.print("Exponente: ");
            int exp = sc.nextInt();

            poli.insertar(coef, exp);
        }

        System.out.println("\nPolinomio ingresado:");
        poli.mostrar();

        System.out.println("\nTabla de valores:");
        poli.tablaValores();

        sc.close();
    }
}
