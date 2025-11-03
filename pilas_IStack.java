pilas_IStack

/**
 *Tema de pilas
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */
public interface IStack<T> {
     void push(T elemnt);//Inserta datos a la pila
     T pop();//Elimina los datos de la pila
     T peek();// verifica los elementos de elementos del principio, al verificar no conoce el elemento por eso es solo y el retorno no lo conoce T
     boolean IsEmpty();
     
}
