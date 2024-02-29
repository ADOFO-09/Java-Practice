package codes_1;
import java.util.Scanner;
// 21
public class DecimalToOctal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int reminder, decNum;
        String octDecNum = "";

        char octDigits[] = {'0', '1', '2', '3', '4','5', '6', '7'};

        System.out.print("Input a decimal number: ");
        decNum = scan.nextInt();

        while(decNum > 0){
            reminder = decNum % 8;
            octDecNum = octDigits[reminder] + octDecNum;
            decNum = decNum / 8;
        }
       
        System.out.print("Octal number is: " + octDecNum + "\n");     
        scan.close();
    }
}
