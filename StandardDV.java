import java.util.Scanner;
import java.text.DecimalFormat;
public class StandardDV {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double sumf = 0;
        double sumfx = 0;
        double mean;
        double sd = 0;
        int sum_diff = 0;
        int n;

        System.out.println("Enter number of elements:");
        n = scan.nextInt();
        double[][] x = new double[n][2];
        System.out.println("Enter x and f values");
        for(int i=0; i<n; i++){
            System.out.println("Enter x values "+ (i+1) + ":");
            x[i][0] = scan.nextDouble();
            System.out.println("Enter f values "+ (i+1) + ":");
            x[i][1] = scan.nextDouble();

            sumf += x[i][1];
            sumfx += x[i][0] * x[i][1]; 
        }
        System.out.println("x" + "\t" + "f");
        for(int i=0; i<n; i++){
            System.out.println(x[i][0] + "\t" + x[i][1]);
        }
        mean = sumfx / sumf;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The mean is "+ df.format(mean));
        
        int i=0;
        while(i<n){
           sum_diff += Math.pow(x[i][0] - mean, 2) * x[i][1];
           i++;
        }

        sd = Math.sqrt(sum_diff/n -1);
        System.out.println("The Standard Deviation is "+ df.format(sd));
        scan.close();

    }
}
