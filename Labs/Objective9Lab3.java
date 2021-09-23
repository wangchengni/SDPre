import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner KB = new Scanner(System.in);
    int selection;

    while(true){
      /*
      Your solution goes here
      */
      printMenu();
      selection = KB.nextInt();
      if (selection == 1){
        System.out.println("Hello Human");
      }
      else if (selection ==2){
         System.out.println("Apples, Bananas, Coconuts");
       }
       else if (selection == 3){
         System.out.println("Goodbye");
         KB.close();
    }
  }
}

    public static void printMenu() {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

}
}
