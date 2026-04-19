package lab1a;


//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

import java.util.*;

public class p10 {
  public static void main(String[] args) {

      // Creating LinkedList
      LinkedList<String> l_list = new LinkedList<>();

      // Adding elements
      l_list.add("Red");
      l_list.add("Blue");
      l_list.add("Green");
      l_list.add("Yellow");
      l_list.add("Black");

      // Display original list
      System.out.println("Original List: " + l_list);

      // Swapping 1st and 3rd elements (index 0 and 2)
      Collections.swap(l_list, 0, 2);

      // Display updated list
      System.out.println("After swapping 1st and 3rd elements: " + l_list);
  }
}
