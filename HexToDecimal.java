package codes_1;
import java.util.Scanner;

public class HexToDecimal {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      // Input hexadecimal number
      System.out.print("Input a hexadecimal number: ");
      String hexNum = scan.next();
      
      // Convert hex to decimal
      int decNum = convertToDecimal(hexNum);

      System.out.println("Equivalent decimal number is: " + decNum);
      scan.close();
   } 
   private static int convertToDecimal(String hexNum){
        int decimal = Integer.parseInt(hexNum, 16);
        return decimal;
   }
}
