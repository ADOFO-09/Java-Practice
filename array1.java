import java.text.DecimalFormat;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sumf = 0, sumfx = 0, mean = 0,n;
        double vr = 0, sd = 0;

        System.out.println("Enter the number of elements:");
        n = scan.nextInt();
        double[][] xf = new double[n][2];

        
        for(int i=0; i<n; i++){
            System.out.println("Enter X value "+ (i+1)+" : ");
            xf[i][0] = scan.nextDouble();
            System.out.println("Enter F value "+ (i+1)+" : ");
            xf[i][1] = scan.nextDouble();
        }

        System.out.println("X\tF");
        for(int i=0; i<n; i++){
            System.out.println(xf[i][0] + "\t" + xf[i][1]);
            sumf += xf[i][1];
            sumfx += xf[i][0] * xf[i][1]; 
            vr += Math.pow((xf[i][0] - mean),2); // variance
        }
        
        mean = sumfx/sumf; // Mean value
        sd = Math.sqrt(vr/n); // Standard deviation
       
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Sumf: "+ sumf);
        System.out.println("Sumfx: "+ sumfx);
        System.out.println("Mean: "+ df.format(mean));
        System.out.println("Std: "+ df.format(sd));
        scan.close();
    }
}

 // Scanner scan = new Scanner(System.in);
        // int sumf = 0, sumxf = 0, mean = 0;
        // int n;

        // System.out.println("Enter the number of elements");
        // n = scan.nextInt();
        // double[][] xf = new double[n][2];
        
        
        // for(int i=0; i<n; i++){
        //   System.out.print("Enter X value "+(i +1)+": ");
        //   xf[i][0] = scan.nextDouble();
        //   System.out.print("Enter F value "+(i +1)+": ");
        //   xf[i][1] = scan.nextDouble();
        // }

        // System.out.println("X\tf");
        // for(int i=0; i<n; i++){
        //     System.out.println(xf[i][0] +"\t"+xf[i][1]);
        //     sumf += xf[i][1];
        //     sumxf += xf[i][0] * xf[i][1];
        // }
        //  mean = sumxf/sumf;
        
        //  DecimalFormat df = new DecimalFormat("#.##");
        //  System.out.println("\tSum f: "+ sumf);
        //  System.out.println("Sum xf:"+ sumxf);
        //  System.out.println("Mean:" + df.format(mean));
        //  scan.close();