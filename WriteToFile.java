
import java.io.FileWriter;


public class WriteToFile {
  public static void main(String[] args){
    try{
        FileWriter myWriter = new FileWriter("D:/code/VS-Java/Filef1.txt");
        myWriter.write("Java is good for writing platform independent applications");
        myWriter.close();
        System.out.println("Successfully wrote to file");
    }catch(Exception e){
        System.out.println("An error occured");
        e.printStackTrace();
    }
  }   
}

