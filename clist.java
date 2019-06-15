// Timothy Khal
// CS202 - Program #4

public class clist { // CLL - Contains rear reference with methods to insert, sort as inserted, and display
    protected node rear; // The list will have a rear pointer

    public node getRear() { // Getter for rear
        return rear;
    }

    clist() { // Default constructor
        rear = null;
    }

    // ============================================================

    protected int insert(vendor obj) { // Insert method, two nodes cannot be added at same time
        if (this.rear == null) {
            this.rear = new node();
            this.rear.setData(obj); // Setting rears data
            this.rear.setNext(this.rear);
        } else {
            node temp = new node();
            temp.setData(obj);
            if (temp.getData().name.equals(this.rear.getNext().getData().name)) // If two node are next to eachother, return 0
                return 0;
            temp.setNext(this.rear.getNext());
            this.rear.setNext(temp);
        }
        return 1;
    }
    // ============================================================

    public int display() { // Wrapper function for display
        return w_display(rear);
    }

    private int w_display(node rear) { // Display function
        if (rear == null) return 0; // If no node are in the list, return 0 for failure

        if (rear.getNext() == null) { // Only one node, so display & return
            System.out.println("Vendor type: " + rear.getData().name);
            System.out.println();
            System.out.println("\nCategories:\n");
            System.out.println();
            for (int i = 0; i < 3; ++i)
                System.out.println(rear.getData().array[i]);
            return 1;
        }
        return display(rear.getNext()); // Call this function to go through list and display all
    }

    private int display(node rear) { // Recursive display function

        if (rear == this.rear) // At the last node
        {
            System.out.println("Vendor type: " + rear.getData().name);
            System.out.println("Categories:");
            for (int i = 0; i < 3; ++i)
                System.out.println(rear.getData().array[i]);
            return 1;
        }
        System.out.println("Name: " + rear.getData().name);
        System.out.println("Categories:");
        for (int i = 0; i < 3; ++i)
            System.out.println(rear.getData().array[i]);

        return display(rear.getNext());
    }
}
    // ============================================================




// Implement remove function
// use equals to strcmp
//   if (rear.getData().getName().equals(string passed in from main))
//      delete




















