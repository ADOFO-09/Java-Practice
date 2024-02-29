package codes_1;
import java.util.Scanner;

public class NumbersToHund {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count;
        for (count= 1; count <= 100; count++){
            if (count % 10 == 0){
            System.out.println(count);
            }else{
                System.out.print(count + "  ");
                s.close();
            }
        // int multi;
        // for(multi = 1; multi <= 100; multi++){
        //     if(multi % 5 ==0){
        //         System.out.print(multi + " ");


        // int sum = 0;
        // int number;
        // for(int i=1; i < 21; i++){
        //  System.out.println("Enter number "+ i + ":");
        //  number = s.nextInt();
        //  sum += number;
        // }
        //  System.out.println("The sum is "+ sum);
        //  s.close();
        }        
    }
}
    



