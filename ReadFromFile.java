// package FileHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // System.out.println("Good");
        String username, password;
        System.out.println("Enter username");
        username = scan.nextLine();
        System.out.println("Enter password");
        password = scan.nextLine();

        String textCombine = username + ":" + password;

        try{
            File myObj = new File("D:/code/OOP PRACTICE/Java-Practice/Filef1.txt");
            Scanner myReader = new Scanner(myObj);
            boolean isValidUser = false;
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                if(data.equals( textCombine)){
                    isValidUser = true;
                    break;
                }
            }
            myReader.close();
            if(isValidUser){
                System.out.println("Login successful");
            }else{
                System.out.println("Try again");
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
         
    }
}

