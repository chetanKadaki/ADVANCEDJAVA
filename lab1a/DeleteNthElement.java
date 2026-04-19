package lab1a;

//Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index
import java.util.*;

public class DeleteNthElement {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      // Creating ArrayList
      ArrayList<String> colors = new ArrayList<>();

      // Adding colors
      colors.add("Red");
      colors.add("Blue");
      colors.add("Green");
      colors.add("Yellow");
      colors.add("Black");

      // Display original list
      System.out.println("Original List: " + colors);

      // Taking input for nth position
      System.out.print("Enter the position (n) to delete: ");
      int n = sc.nextInt();

      // Removing nth element (index = n-1)
      if (n > 0 && n <= colors.size()) {
          colors.remove(n - 1);
          System.out.println("After deleting " + n + "th element: " + colors);
      } else {
          System.out.println("Invalid position!");
      }

      sc.close();
  }
}


