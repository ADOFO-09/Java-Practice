public class Statistics {
   double getInfo(int[]x){
       int sum = 0;
       for(int i=0; i<x.length; i++){
            sum += Math.pow(x[i], 2);
       }
       return  sum / (double)x.length;
   }

   public static void main(String[] args){
    Statistics calc = new Statistics();
    int [] data = {4,10,20,30,25};
    double mean = calc.getInfo(data);

    System.out.println("The mean is " + mean);
   }

}
