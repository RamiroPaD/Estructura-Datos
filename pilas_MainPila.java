pilas_MainPila

/**
 *Tema de pilas
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */
public class MainPila {
    public static void main(String[] args){
        StackArray<String> pila = new StackArray<String>(5);
        pila.push("Emanuel");
        pila.push("Oswaldo");
        pila.push("Richi");
        
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}
