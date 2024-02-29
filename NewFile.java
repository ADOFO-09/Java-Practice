
import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args){
       try{
       File myObj = new File("D:/code/VS-Java/Filef1.txt");
       if (myObj.createNewFile()){
        System.out.print("File created: " + myObj.getName());
        } else {
            System.out.print("File already exists");
        }
        
       }catch(IOException e){
        System.out.println("An error occurred while creating file");
        e.printStackTrace();
       }

    }
}

