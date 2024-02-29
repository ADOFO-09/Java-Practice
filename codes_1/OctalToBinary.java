package codes_1;
import java.util.Scanner;
// 26
public class OctalToBinary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input an octal number: ");
        String octNum = scan.next();

        String biNum = convertToBinary(octNum);

        System.out.println("Equivalent Binary number: " + biNum);
        scan.close();
    }
    
    private static String convertToBinary(String octNum){
        int decNum = Integer.parseInt(octNum, 8);

        String binary = Integer.toBinaryString(decNum);
        return binary;
    }
}
