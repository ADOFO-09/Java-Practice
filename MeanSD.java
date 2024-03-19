import java.util.Scanner;
import java.text.DecimalFormat;
public class MeanSD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = getSum(20, 3);

        System.out.println("Average:" + sum);


        int add = 0;
        double mean;
        double sd = 0;
        int sum_diff = 0;
        int n;

        // Calculating the mean and standard deviation

        System.out.println("Enter the number of integers:");
        n = scan.nextInt();
        int[] x = new int[n];
        System.out.println("Enter the integers:");
        for(int i=0; i<n; i++){
            x[i] = scan.nextInt();
            add += x[i];          
        }
    
        mean = add / n;
         System.out.println("The mean is: " + mean); // Mean Calculated
        // for(int i=0; i<5; i++) sum_diff += Math.pow(x[i] - mean, 2);
        int i = 0;
        while(i < n){
            sum_diff += Math.pow(x[i] - mean, 2);
            i++;  
        }
        
        DecimalFormat df = new DecimalFormat("#.##");
        sd  = Math.sqrt(sum_diff / n);
        System.out.print("The Standard deviation is: " + df.format(sd)); // 
        scan.close();
     
       
    }
    static int getSum(int x, int y){
        return x + y;
    }
    static double getAverage(int x, int y, int z){
        int sum = x + y + z;
        return sum/ 3.0;
    }
}
