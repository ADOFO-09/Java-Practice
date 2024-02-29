package codes_1;
import java.util.Scanner;
//23
public class BinaryToHex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1, j = 0, remainder, decNum = 0, biNum;
        int[] hexNum = new int[1000];

        System.out.print("Input a binary number: ");
        biNum = scan.nextInt();

        // Convert binary to decimal
        while (biNum > 0){
            remainder = biNum % 2;
            decNum = decNum + remainder * i;
            i = i * 2;
            biNum = biNum / 10;
        }
         i = 0;
        // Convert Decimal to Hexadecimal
        while (decNum != 0){
            hexNum[i] = decNum % 16;
            decNum = decNum / 16;
            i++;
        }

        System.out.print("Hexadecimal value: ");
        for(j = i - 1; j >= 0; j--){
            if (hexNum[j] > 9){
                System.out.print((char)(hexNum[j] + 55));
        } else {
            System.out.print(hexNum[j]);
            scan.close();
            }
        }
        System.out.print("\n");
        
    }
}
