package codes_1;
import java.util.Scanner;
// 25
public class OctalToDecimal {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long octNum, decNum = 0;
      int i = 0;
      double op;

      System.out.print("Input octal number: ");
      octNum = scan.nextLong();

      while (octNum != 0){
        op = Math.pow(8, i++);
        decNum = (long)(decNum + (octNum % 10) * op );
        octNum = octNum / 10;
      }

      System.out.print("Equivalent decimal number: " + decNum + "\n");
      scan.close();
    }
}
