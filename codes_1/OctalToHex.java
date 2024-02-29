package codes_1;
import java.util.Scanner;
// 27
public class OctalToHex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String octNum, hexNum;
        int decNum;

        System.out.print("Input an octal number:");
        octNum = scan.nextLine();

        // Convert Octal to decimal
        decNum = Integer.parseInt(octNum, 8);
        
        // Convert decimal to hex
        hexNum = Integer.toHexString(decNum);

        System.out.print("Equivalent hexadecimal number:"+ hexNum + "\n");
        scan.close();
    }
}
