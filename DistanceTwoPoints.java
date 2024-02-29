package codes_1;
import java.util.Scanner;
public class DistanceTwoPoints {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      double x1,y1,x2,y2;
      double d, r = 6371.01;
      
      System.out.print("Input the latitude of coordinate 1:");
      x1 = Math.toRadians(scan.nextDouble());
      System.out.print("Input the longitude of coordinate 1:");
      y1 = Math.toRadians(scan.nextDouble());
      System.out.print("Input the latitude of coordinate 2:");
      x2 = Math.toRadians(scan.nextDouble());
      System.out.print("Input the longitude of coordinate 2:");
      y2 = Math.toRadians(scan.nextDouble());

      d = r * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

      System.out.print("The distance between those points is: "+ d + " km");
      scan.close();

   } 
}


// Write a Java program to compute the distance between two points on the 
// surface of earth.
// Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers
// Input Data:
// Input the latitude of coordinate 1: 25
// Input the longitude of coordinate 1: 35
// Input the latitude of coordinate 2: 35.5
// Input the longitude of coordinate 2: 25.5
// Expected Output
// The distance between those points is: 1480.0848451069087 km