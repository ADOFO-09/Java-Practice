package codes_1;
import java.util.Scanner;

public class ConstituentDigits {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int number;
    String digits= " ";
    

    System.out.print("Enter integer number:");
    number = scan.nextInt();

    while(number > 0){
        int digit = number % 10;
        digits = String.valueOf(digit)+ " " + digits;
        number = number / 10;  
      }
        System.out.println(digits);
        scan.close();
    } 
}

// Write java program that accepts an integer number from the user
// and displays the constituent digits in the number seperated by spaces
