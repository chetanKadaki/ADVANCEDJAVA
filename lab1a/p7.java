package lab1a;

//Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

import java.util.*;

public class p7 {
  public static void main(String[] args) {

      // Creating LinkedList
      LinkedList<String> objlist = new LinkedList<>();

      // Adding elements
      objlist.add("Red");
      objlist.add("Blue");
      objlist.add("Green");
      objlist.add("Yellow");
      objlist.add("Black");

      // Display original list
      System.out.println("Original List: " + objlist);

      // Using descendingIterator for reverse iteration
      Iterator<String> iterator = objlist.descendingIterator();

      // Iterating in reverse order
      System.out.print("Reverse Order: ");
      while (iterator.hasNext()) {
          System.out.print(iterator.next() + " ");
      }
  }
}
