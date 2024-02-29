package codes_1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      char[] letter;
      

      System.out.print("Input a string:");
      letter = scan.nextLine().toCharArray();

      System.out.println("Reversed String");
      
      for(int i= letter.length - 1; i >= 0; i--){
         System.out.print(letter[i]);
         scan.close();
      } 
      
    }
}

// Write a Java program to reverse a string.
// Input Data:
// Input a string: The quick brown fox
// Expected Output
// Reverse string: xof nworb kciuq ehT