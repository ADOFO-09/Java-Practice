import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryReadScanner {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String username, password;

    System.out.println("Enter username");
    username = scan.nextLine();
    System.out.println("Enter password");
    password = scan.nextLine();

    String inputString = username + ":" + password;
    
    try{
        File myObj = new File("D:/code/VS-Java/Filef2.txt");
        Scanner myReader = new Scanner(myObj);
        boolean isUserValid = false;
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            if(data.equals(inputString)){
                isUserValid = true;
                break;
            }
        }
        myReader.close();
        if(isUserValid){
            System.out.println("Login successful");
        }else{
            System.out.println("Try again");
        }
       
    }catch(FileNotFoundException e){
        System.out.println("An error occured while reading.");
        e.printStackTrace();
    }
   
    }
}
