package codes_1;
import java.util.Scanner;
//24
public class BinaryToOctal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String biNum = scan.next();

        String octNum = convertToOctal(biNum);

        System.out.println("Octal number: "+ octNum);
        scan.close();
    }

    private static String convertToOctal(String biNum){
       // Convert binary to decimal 
       int decNum = Integer.parseInt(biNum, 2);

       // Convert decimal to octal
       String octal = Integer.toOctalString(decNum);
       return octal;
       
    }
}
