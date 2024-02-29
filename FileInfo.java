
import java.io.File;

public class FileInfo {
    public static void main(String[] args){
        File myObj = new File("D:/code/VS-Java/Filef2.txt");
        if(myObj.exists()){
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("File length: "+ myObj.length());
            System.out.println("Writable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
        }else{
            System.out.print("File does not exist");
        }
    }
}
