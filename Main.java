import java.util.Scanner;
/**
 * This program will prompt the user for a positive integer and then print the numbers from 1 to that number on a single line with commas in between them
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a positive integer");
    int integer = input.nextInt();

    for(int count = 1; count <= integer; count++){
      if(count == integer){
        System.out.print(integer);
      } else if(count < integer){
        System.out.print(count + ",");
      }
    }
    
  }
}
