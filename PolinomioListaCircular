/**
 * En este codigo se realizo la actividad numero uno de los Ejercicios practicos numero Actividad Actividad 04: Polinomio con Lista Enlazada Circular 
 * Objetivo: Modificar la representación de un polinomio mediante lista enlazada simple para que se 
 * convierta en una lista circular, optimizando el acceso y recorrido continuo. 
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */

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


class PolinomioCircular {
    private Nodo cabeza = null;

    
    public void insertar(double coef, int exp) {
        Nodo nuevo = new Nodo(coef, exp);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza; 
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("El polinomio está vacío.");
            return;
        }

        System.out.print("P(x) = ");
        Nodo actual = cabeza;
        do {
            System.out.print(actual.coeficiente + "x^" + actual.exponente);
            actual = actual.siguiente;
            if (actual != cabeza) {
                if (actual.coeficiente >= 0) System.out.print(" + ");
                else System.out.print(" ");
            }
        } while (actual != cabeza);
        System.out.println();
    }

    public double evaluar(double x) {
        double resultado = 0;
        if (cabeza == null) return 0;

        Nodo actual = cabeza;
        do {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        } while (actual != cabeza);
        return resultado;
    }

    public void tablaValores() {
        System.out.println("\n x\t|\tP(x)");
        System.out.println("-------------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            System.out.printf(" %.1f\t|\t%.4f\n", x, evaluar(x));
        }
    }
}

public class PolinomioListaEnlazadaCircular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolinomioCircular poli = new PolinomioCircular();

        System.out.println("=== POLINOMIO CON LISTA ENLAZADA CIRCULAR ===");
        System.out.println("Ingrese los términos del polinomio (coeficiente y exponente).");
        System.out.println("Ejemplo: para 3x^4 -4x^2 +11, escriba:");
        System.out.println("3 4, luego -4 2, luego 11 0");
        System.out.println("Escriba 'q' para terminar.\n");

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
