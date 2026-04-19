package lab1a;

//Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )

import java.util.*;

public class p9 {
  public static void main(String[] args) {

      // Creating LinkedList
      LinkedList<String> l_listobj = new LinkedList<>();

      // Adding elements
      l_listobj.add("Red");
      l_listobj.add("Blue");
      l_listobj.add("Green");
      l_listobj.add("Yellow");
      l_listobj.add("Black");

      // Display elements with their positions
      System.out.println("Elements and their positions:");
      for (int p = 0; p < l_listobj.size(); p++) {
          System.out.println("Position " + p + " : " + l_listobj.get(p));
      }
  }
}


