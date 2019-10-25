package Stack.proyec;
import java.util.LinkedList; 
import java.util.Queue; 
  
public class QueueApp 
{ 
  public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
  
    for (int i=5; i<20; i++) 
     q.add(i); 
  
    System.out.println("Elementos: "+q); 
  
    int removedele = q.remove(); 
    System.out.println("eliminamos el primero: " + removedele); 
  
    System.out.println(q); 
  
    int head = q.peek(); 
    System.out.println("ahora el primero es: " + head); 
  
     
    int size = q.size(); 
    System.out.println("tamaño de la cola: " + size); 
  } 
} 