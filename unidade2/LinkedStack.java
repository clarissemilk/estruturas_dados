import java.util.Stack;
public class LinkedStack<T> implements Stackable<T> {

    // aponta para o topo da pilha
   private DoubleNode<T> topPointer;
   // indica o número atual de dados pilha
   private int numberElements;
   // indica o número máximo de elementos que a pilha pode ter
   private int maxElements;

   /** 
    * verifica se a pilha está vazia
    * 
    * @return true se a pilha estiver vazia, false caso contrário
    */

   @Override
   boolean isEmpty(){
        return numberElements == 0; 
   } 
   /**
    * 
    */
    boolean isFull(){
        return numberElements == maxElements;   
    }

   T pop();
   push(T data);
   void update(T newData);
   T peek(); 
   
   boolean isEmpty();   
   boolean isFull();    

    
}