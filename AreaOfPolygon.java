package codes_1;
import java.util.Scanner;
public class AreaOfPolygon {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       double area;
       int s,n;
       double π=3.14159265359;

    
       System.out.print("Input the number of sides on the polygon:");
       n = scan.nextInt();
       System.out.print("Input the length of one of the sides:");
       s = scan.nextInt();
       
       area = (n*Math.pow(s,2))/(4*Math.tan(π/n));

       System.out.print("The area is: "+ area);
       scan.close();
    }
}


// Write a Java program to compute the area of a polygon.
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side
// Input Data:
// Input the number of sides on the polygon: 7
// Input the length of one of the sides: 6
// Expected Output
// The area is: 130.82084798405722

