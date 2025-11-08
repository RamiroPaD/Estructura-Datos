import java.util.Scanner;

/**
 * Ejercicio Gestor de temperatura
 * Objetivo: Aplicar los fundamentos del manejo de arreglos unidimensionales en la programación 
 * estructurada, realizando operaciones básicas de carga, recorrido, cálculo y búsqueda de 
 * datos. 
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 07/Noviembre/2025
 */
public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar un arreglo de tipo flotante (float) de tamaño 7 para almacenar las 
        // temperaturas promedio de la semana.
        float [] temp = new float [7];
        // Cargar los datos utilizando un ciclo for 
        // ingrese la temperatura promedio de cada día.
        for(int i = 0; i < 7; i++){
            System.out.print("Ingrese la temperatura promedio de cada dia " +(i+1)+":");
            temp[i] = sc.nextFloat();
        }
        // Recorrer el arreglo  
        float suma = 0;// Acumula la suma total de temperaturas
        float tempMaxima = temp[0];//Guarda la temperatura mas alta
        int dia = 0;// Guarda el índice (día) en que ocurrió la temperatura máxima
        // Recorrer el arreglo para sumar temperaturas y buscar la máxima
        for(int i = 0; i < 7; i++){
          suma += temp[i];
          // Si la temperatura actual es mayor que la máxima registrada, actualizar valores
          if(temp[i] > tempMaxima){
              tempMaxima = temp[i];
              dia = i;
          }
        }
        // Calcula la temperatura promedio semanal
        float proSemanal = suma / 7;
        // Identificar la temperatura maxima y el dia(indice) en que ocurrio
        System.out.print("temperaturas que se ingresaron: ");
        // Mostrar las temperaturas ingresadas
        for(float temperatura : temp ){
            System.out.print(temperatura + "");
        }
        //Muestra los resultados obtenidos
        System.out.println("La temperatura que hubo de promedio semanal es de: " + proSemanal);
        System.out.println("La temperatura maxima fue de: " + tempMaxima + "\n el dia en que ocurrio fue: " + dia);
        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
    
}

// Evaluado por Angel Alfredo Luna Perez:}
// Calificacion total 60% cuentas con los puntos 1,2 y 5
