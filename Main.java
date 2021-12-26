import java.util.Scanner;    // needed for Scanner class
class Main {
  public static void main(String[] args) {
    int count = 1;    // count is initiliazed

      while (count <= 10)    // count is tested
      {
         System.out.print(count + " ");
         count++;            // count is changed
      }
      int value;      // to hold number
      int sum = 0;    // initialize the sum

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      // Get the first value.
      System.out.print("Enter first integer (enter 0 to quit): ");
      value = console.nextInt();

      while (value != 0)
      {
         // Add value to sum
         sum = sum + value;

         // Get the next value from the user
         System.out.print("Enter next integer (enter 0 to quit): ");
         value = console.nextInt();
      }

      // Display the total.
      System.out.println("Sum of the integers: " + sum);
  }
}