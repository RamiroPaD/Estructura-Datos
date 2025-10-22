pilas_StackArray

/**
 *Tema de pilas
 * @author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com
 */
public class StackArray<T> implements IStack<T> {
  private T[] elements;
  private int top;
  
  public StackArray(){
      elements = (T[])new Object[30];
  }
  
  public StackArray(int size){
      elements = (T[])new Object[size];
  }
  
    @Override
    public void push(T elemnt) {
      if (top < elements.length - 1) {
         top++;
          
          elements[top] = elemnt;
         } else {
        System.out.println("Esta llena");
     }
    }
    
    @Override
    public T pop() {
    if (IsEmpty()) {
        System.out.println("Pila Vacía");
 }
        System.out.println("Conociendo el último de la pila");
      return (T) elements[top -1];
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean IsEmpty() {
   
        return top == 0;
    }
    
}
