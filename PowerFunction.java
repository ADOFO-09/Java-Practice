package codes_1;
import java.util.Scanner;
public class PowerFunction {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x,y,base = 1;

        System.out.print("Input first number:");
        x = scan.nextInt();
        System.out.print("Input second number:");
        y = scan.nextInt();

        for(int i=1; i<= y; i++){
            base *= x;
        }
        System.out.print(x + " raise to the power " + y + " is "+ base);
        scan.close();
    
    }
}
