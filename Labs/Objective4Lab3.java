
import java.util.Scanner;
import java.time.LocalDate;

public class Objective4Lab3 {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();
    LocalDate dt = LocalDate.now();
    int currentYear = dt.getYear();
    int birthYear = currentYear - age;

    /*
    Your solution goes here
    */

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
