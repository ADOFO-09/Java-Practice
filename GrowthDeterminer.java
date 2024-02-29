package codes_1;
import java.util.Scanner;
public class GrowthDeterminer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String firstname, lastname, growthState="";       
        char gender;
        int age;
        System.out.print("Enter first name:");
        firstname = scan.nextLine();
        System.out.print("Enter last name:");
        lastname = scan.nextLine();
        System.out.print("Enter your age:");
        age = scan.nextInt();
        System.out.print("Enter your gender(M/F):");
        gender = scan.next().charAt(0);

        if(gender != 'M' && gender != 'F'){
            System.out.print("Error: Please enter gender again(M/F):");
            gender = scan.next().charAt(0);

            // Conditions for growth state
            if(age >= 0 && age <= 5){
                growthState = "baby";
            }else if(age >= 6 && age <= 11){
                growthState = "toddler";
            }else if(age >= 12 && age <= 18){
                growthState = "an adolescent";
            }else if(age >= 19 && age <= 39){
                growthState = "an adult";
            }else{
                growthState = "at old age";
            } 
        }
            if(age >= 0 && age <= 5){
                growthState = "baby";
            }else if(age >= 6 && age <= 11){
                growthState = "toddler";
            }else if(age >= 12 && age <= 18){
                growthState = "an adolescent";
            }else if(age >= 19 && age <= 39){
                growthState = "an adult";
            }else{
                growthState = "at old age";
            }             

         // Displaying program output
         System.out.println(firstname + " " + lastname+ " you are " + growthState);

         // Closing scan method
         scan.close();
       
    }           
       
}

