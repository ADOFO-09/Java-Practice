package codes_1;
import java.util.Scanner;
// 20
public class DecimalToHex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int reminder, decNum;
        String hexDecNum = "";

        char hexDigits[] = {'0', '1', '2', '3', '4','5', '6', '7', '8', '9','A','B','C','D','E','F'};

        System.out.print("Input a decimal number: ");
        decNum = scan.nextInt();

        while(decNum > 0){
            reminder = decNum % 16;
            hexDecNum = hexDigits[reminder] + hexDecNum;
            decNum = decNum / 16;
        }
       
        System.out.print("Hexadecimal number is: " + hexDecNum + "\n");     
        scan.close();
    }
    
}
