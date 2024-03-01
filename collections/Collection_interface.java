import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;


public class Collection_interface {
    public static void main(String[] args){
    Collection<String>coll = new ArrayList<String>();
        Collection<String>coll2 = new TreeSet<String>();
        coll2.add("Harry");
        coll2.add("Sally");

        coll.add("Adofo");
        coll.add("Nixon");
        int n = coll2.size();

        coll.remove("Adofo");
        boolean b = coll.remove("Tom");

        b = coll.contains("Nixon"); // Checks whether this collection contains a given element

    
        String s = coll.toString(); // s is now "[Adofo,Nixon]"
        System.out.println(coll + " " + n + " " + b);  
        
        //This loop prints the elements on separate lines.
        for (String a: coll){ 
            System.out.println(a);
        }
        
    }
}

 