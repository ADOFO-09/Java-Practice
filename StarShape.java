import java.util.Scanner;

public class StarShape {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        

        System.out.print("Enter x: ");
        int x = scan.nextInt();
        System.out.print("Enter y: ");
        int yFirst = scan.nextInt();
        int product = 1;
        for (int y = yFirst; y > 0; y--)
            product *= x;
        System.out.println("result = "  + product);
        scan.close();
        // final int MAX_ROWS = 10;

        // for(int row=1; row <= MAX_ROWS; row++){
        //     for(int star = 1; star <= MAX_ROWS; star++){
        //         System.out.print("*");

        //         System.out.println();
            }
        }
    


