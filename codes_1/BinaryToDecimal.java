package codes_1;
import java.util.Scanner;
// 22
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long remainder, biNum, decNum = 0, i = 1;

        System.out.print("Input a decimal number: ");
        biNum = scan.nextLong();

        while(biNum != 0){
            remainder = biNum % 10;
            decNum = decNum + remainder * i;
            i = i * 2;
            biNum = biNum / 10;
        }
       
        System.out.print("Decimal Number: " + decNum + "\n");     
        scan.close();
    }
}
