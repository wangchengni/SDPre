import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int userNum = scanner.nextInt();
      int j = 0;
      if (userNum < j){
        System.out.println("The number is negative");
      }
      else if (userNum == j){
        System.out.println("The number is 0");
      }
      else {
        System.out.println("The number is positive");
      }
      scanner.close();
  }
}
