import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;


public class Collection_interface {
    public static void main(String[] args){
    Collection<String>coll = new ArrayList<String>();
    Collection<String>coll2 = new TreeSet<String>();
    LinkedList<String>mylist = new LinkedList<String>();
        coll2.add("Harry");
        coll2.add("Sally");

        coll.add("Adofo");
        coll.add("Nixon");
        int n = coll2.size();

        coll.remove("Adofo");
        boolean b = coll.remove("Tom");

        b = coll.contains("Nixon"); // Checks whether this collection contains a given element

    
        // String s = coll.toString(); // s is now "[Adofo,Nixon]"
        // System.out.println(coll + " " + n + " " + b);  
        
        //This loop prints the elements on separate lines.
        // for (String a: coll){ 
        //     // System.out.println(a);
        // }

        // Linked list Methods
        mylist.addLast("Micheal");
        mylist.add("Yussif");
        mylist.addFirst("Emmanuel");
        System.out.println( mylist.getFirst());
        System.out.println(mylist.getLast());
        System.out.println(mylist);

        String removed = mylist.removeFirst();
        System.out.println(removed);
        
        //List Iterator
        ListIterator<String> iter = mylist.listIterator();
        iter.next(); // returns a reference to the value of the next element
        iter.add("Prince");
        System.out.println(mylist);
        System.out.println(iter.previous());
        iter.set("Frank"); // Updates the last element returned by next or previous
        System.out.println(mylist);

        b = iter.hasNext(); // returns true if there is a next element
        System.out.println(b);
        
        iter.add("Diana"); // Adds an element before the iterator position(ListIterator only)

        if(iter.hasPrevious()){
           String s = iter.previous();
           System.out.println(s);
        }
        System.out.println(mylist);
        iter.remove(); // Removes the last element returned by next or previous.
        // You cannot call it immediately after a call to add().It can be called only once after a next or previous.
        System.out.println(mylist);
       
        
    }
}

 