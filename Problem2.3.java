/*******************************************************
Program Number: 1a
Author: Nicolas Dabdoub
Purpose/Description: To write routines to support the deque that take O(1) time
Due date: <02/28/15>
Certification:
I hereby certify that this work is my own and none of it is the
work of any other person.
 < Nicolas Daboub> 
*******************************************************/
import java.util.*;

public abstract class Problem3<AnyType> implements Iterable<AnyType>
{   
    private Node<AnyType> head;
    
   public Problem3()
   {
       
      head = null;
   }
 
   public void push(AnyType x)
   {
      head = new Node<AnyType>(x, head);
   }

   public AnyType popHelper()
   {
      if(head == null) throw new NoSuchElementException();

      return head.data;
   }
   
   public AnyType pop()
   {
      if(head == null) throw new NoSuchElementException();
      AnyType temp = head.data;
      head = head.next;
      return temp;
   }

   public void inject(AnyType x)
   {
      if( head == null)
         push(x);
      else
      {
         Node<AnyType> temp = head;
         while(temp.next != null) 
            temp = temp.next;
         temp.next = new Node<AnyType>(x , null);
      }
   } 

   public AnyType eject()
   {
      if(head == null) throw new NoSuchElementException();

      Node<AnyType> temp = head;
      while(temp.next != null) 
         temp = temp.next;
      
      temp.prev.next = null;    
      
      return temp.data;
   }
 
   private static class Node<AnyType>
   {
      private AnyType data;
      private Node<AnyType> next;
      private Node<AnyType> prev;

      public Node(AnyType data, Node<AnyType> next)
      {
         this.data = data;
         this.next = next;
         this.prev = prev;
      }
   }
}