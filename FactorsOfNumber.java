package codes_1;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Input integer number:");
        number = scan.nextInt();

        System.out.print("The factors of "+ number + " is ");
        int i = 1;
        
        do
        {
            if(number % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        while(i <= number);
        

        // int i= 1;
        // while (i <= number){
        //     if(number % i == 0){
        //         System.out.print(i + " ");
        //     }
        //     i ++;
        // }

        // for(int i=1; i <= number; i++){
        //     if(number % i == 0){
        //         System.out.print(i + " ");
        //         scan.close();
            }
        }
    

