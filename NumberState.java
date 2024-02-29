package codes_1;
import java.util.Scanner;
public class NumberState {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        String state = "";
        

        System.out.print("Please enter an integer number:");
        number = scan.nextInt();

        
        for (int i = 1; i < number; i++){
            boolean factor = (number % i) == 0;
            if(factor){
               sum += i;
            }
            
        }
            if(sum == number){
                state = "SUFFICIENT";
            }else if(sum < number){
                state = "DEFICIENT";
            }else{
                state = "ABUNDANT";
            }
           System.out.print(sum +" "+ state);
           scan.close();
        }
        
    }



