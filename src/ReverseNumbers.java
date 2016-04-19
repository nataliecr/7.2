import java.util.Scanner;

public class ReverseNumbers {
  public static void main(String[] args){
    int[] numbers = new int[10];
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten integers: ");
    for (int i = 0; i < 10; i++)
      numbers[i] = input.nextInt();
    
    System.out.print("The numbers in reverse are ");
    for (int i = 9; i >= 0; i--)
      System.out.print(numbers[i] + " ");
    
    System.out.println();
  } // main
} // ReverseNumbers
