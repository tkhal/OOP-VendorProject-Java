// Main.java - Used to gather information from user and call designated methods
// Note - After the first iteration, the menu is being printed out twice.

import java.util.Scanner; // Used for reading in from user

// Timothy Khal
// CS202 - Program #4

public class main {
    public static void main(String args []){
        Scanner read = new Scanner(System.in); // Creating scanner obj to read in
        clist options = new clist(); // Creating object of clist to call functions

        String response;
        System.out.println("Menu ------\n");
        //char response = new char[]; // User input will be stored inside of 'response
        do { // change into do-while loop. it's while now because it's not fucking working

            System.out.println("1) Add a new vendor"); // Add a new vendor to the list
            System.out.println("2) Display vendors"); // Go through list and display all vendors
            System.out.println("3) Quit"); // Quit program
            response = read.nextLine();

            switch (response) {
                case "1":
                    System.out.println("What type of vendor would you like to add?\n");

                    System.out.println("a) Food vendor");
                    System.out.println("b) Alcohol vendor");
                    System.out.println("c) Music album vendor");
                    String vendorType = read.nextLine(); // Storing vendor type response inside of vendorType

                    switch (vendorType) {
                        case "a":
                            float foodCost; // Storing cost inside of foodCost
                            String foodName = "Food";
                            System.out.println("Please enter the cost in US dollars:\n $");
                            foodCost = read.nextFloat(); // Storing user response in temp float

                            vendor foodObj = new food(foodName, foodCost); // <-- Why unresolved symbol???
                            int i = options.insert(foodObj); // Calling the insert function, passing in the data we received from user

                            if (i == 1) // Checking to see if two vendors of same type were added next to each other
                                System.out.println("Success: Food vendor has been added!");
                            else if (i == 0)
                                System.out.println("Failure: Two vendors of the same type cannot be added next to each other");

                            break;
                        case "b":
                            float alcoholCost; // Storing cost inside of alcoholCost
                            String alcoholName = "Alcohol";
                            int age;
                            System.out.println("Please enter the cost in US dollars:\n");
                            alcoholCost = read.nextFloat(); // Storing user response
                            System.out.println("Please enter your age to confirm you're 21+");
                            age = read.nextInt();

                            if (age < 21) {
                                System.out.println("Error, must be 21 to manage alcohol");
                                return;
                            }

                            vendor alcoholObj = new alcohol(alcoholName, alcoholCost, age);
                            int j = options.insert(alcoholObj);

                            if (j == 1)
                                System.out.println("Success: Alcohol vendor has been added!");
                            else if (j == 0)
                                System.out.println("Failure: Error adding alcohol vendor.");

                            break;

                        case "c":
                            float musicCost; // Storing cost inside of music cost
                            String album; // Used to store user response for album
                            String musicName = "Music";
                            System.out.println("Enter the name of an album you'd like to add");
                            album = read.nextLine();
                            System.out.println("Enter the cost of an album in US dollars");
                            musicCost = read.nextFloat();

                            vendor musicObj = new music(musicName, musicCost, album);

                            int k = options.insert(musicObj);

                            if (k == 1)
                                System.out.println("Success: Music vendor has been added!");
                            else if (k == 0)
                                System.out.println("Failure: Error adding alcohol vendor.");
                            break;


                        default:
                            System.out.println("Invalid option, please try again\n");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("All Vendors:");
                    int i = options.display();

                    /*
                    if (i == 1) // Error checking
                        System.out.println("Success: List displayed");
                    else i
                    f (i == 0)
                        System.out.println("Failure: List doesn't exist");

                     */
                    break;


                case "3":
                    System.out.println("Program ending...");
                    return;
                    /*
                default:
                    System.out.println("Invalid option, please try again\n");
                    break;
                     */

            }
        } while (response != "3") ;
    }
}


















