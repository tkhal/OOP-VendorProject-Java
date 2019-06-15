// Timothy Khal
// CS202 - Program #4

// Node class - Each node will contain a reference to the abstract base class 'vendor'

public class node {

    //private int array[] = new int[3]; // Each node will contain an array of size 3
    //private String vendorName = new String(); // Each node will contain
    private node next; // Each node will contain a reference to a next reference
    protected vendor data; // Each node will have a reference to abstract class 'vendor'

    node(){ // Default constructor
        next = null;
    }


    public node getNext(){ // Returns next reference
        return next;
    }
    public void setNext(node next){ // Sets next reference
        this.next = next;
    }
    public void setData(vendor data){ // Setter for data
        this.data = data;
    }
    public vendor getData(){ // Getter for data
        return data;
    }
}
