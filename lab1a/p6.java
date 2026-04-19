package lab1a;

//Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2 nd ) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.*;

public class p6 {
  public static void main(String[] args) {

      // Creating LinkedList
      LinkedList<String> listobj = new LinkedList<>();

      // Adding elements
      listobj.add("Red");
      listobj.add("Blue");
      listobj.add("Green");
      listobj.add("Yellow");
      listobj.add("Black");

      // Display original list
      System.out.println("Original List: " + listobj);

      // Iterator starting from 2nd position (index 1)
      ListIterator<String> iteratorobj = listobj.listIterator(1);

      // Iterating from 2nd element
      System.out.print("Elements from 2nd position: ");
      while (iteratorobj.hasNext()) {
          System.out.print(iteratorobj.next() + " ");
      }
  }
}

