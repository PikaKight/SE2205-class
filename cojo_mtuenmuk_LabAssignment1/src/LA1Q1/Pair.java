package LA1Q1;

import java.time.*;
import java.time.format.*;
import java.util.*;

// Creating Generic Class Pair
public class Pair <Y,N> {
    private Y key;
    private N value;

    // Constructor
    public Pair (Y key, N value){
        this.key = key;
        this.value = value;
    }

    // Set Key Method for private Y key
    public void setKey(Y key) {
        this.key = key;
    }

    // Set Value Method for private N value
    public void setValue(N value) {
        this.value = value;
    }

    // Returns private key value
    public Y getKey() {
        return key;
    }

    // Returns private value value
    public N getValue() {
        return value;
    }

    // Header method with student details
    public static void header() {
        System.out.println("*******************************************************");
        System.out.println("Names: Christopher and Marcus");
        System.out.println("Student Numbers: 251168901 and 251162913");
        System.out.println("Goal of this project: To further understand Generic Classes " +
                "and \nJava Fundamentals using Student representatives and their years");
        System.out.println("*******************************************************\n");
    }

    // Footer method with date and time
    public static void footer() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String Date =  (LocalDateTime.now()).format(myFormatObj);
        String Day = Date.substring(0,10);
        String Time = Date.substring(11);

        System.out.println("\n*******************************************************");
        System.out.println("This is " + Time + " on " + Day + ".\n" +
                "Completion of Lab Assignment 1 is successful!\n" +
                "Good bye! Christopher Ojo and Marcus Tuen Muk.");
        System.out.println("*******************************************************");
    }

    // create a generic method using ArrayLists
    public static <Y,N> ArrayList<Pair> getRep_ChristopherMarcus(Pair[] pa) {
        ArrayList<Integer> repYear = new ArrayList<>();
        ArrayList<String> repName = new ArrayList<>();
        ArrayList<Pair> myArray = new ArrayList<>();

        // Looping through array pa to check if a rep leader has already been added for the year found
        for(int i = 0; i < pa.length ; i++) {
            if (!repYear.contains(pa[i].getKey())) {
                repYear.add((int)pa[i].getKey());
                repName.add((String)pa[i].getValue());

                myArray.add(i,new Pair<>(repYear.get(i),repName.get(i)));
            }
        }

        return myArray;
    }

    // Driver method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        header();

        // Declaring year and leaders in Array Lists specified as Integers and Strings
        ArrayList<Integer> year = new ArrayList<>(Arrays.asList(2, 3, 4 ,3 ,2 ,2));
        ArrayList<String> leader = new ArrayList<>(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna", "Vincent"));

        // Creating an array of type pair, same size as leaders given.
        Pair[] yearLeader = new Pair[year.size()];

        for(int i = 0; i < year.size(); i++) {
            yearLeader[i] = new Pair<>(year.get(i),leader.get(i));
        }

        // String proceed variable used for looping with while statement
        String proceed = "y";

        while(proceed.equals("y")) {
            // Defaults error to true, until the user has input something that is not accepted
            boolean error = true;
            int yearInput = 0;
            System.out.print("From which academic year would you like to list the names of the leaders: ");

            // Looping through the error checking statement
            while(error) {
                try {
                    yearInput = input.nextInt();

                    if (yearInput >= 2 && yearInput <= 4) {
                        error = false;
                    }
                    else
                    {
                        throw new ArithmeticException();
                    }
                }
                catch(ArithmeticException ax) { // Catching exception if they type the wrong numbers, doesn't need to clear buffer
                    System.out.print("Invalid Entry! Enter a positive integer between 2 and 4: ");
                }
                catch(Exception ex) { // Catching all other exceptions
                    input.nextLine();
                    System.out.print("Invalid Entry! Enter a positive integer between 2 and 4: ");
                }
            }

            // Clear Buffer
            input.nextLine();

            ArrayList<String> leaderCount = new ArrayList<>();

            // Enhanced for loop for checking the leaders found in a specific year
            for (Pair p : yearLeader) {
                if ((Integer) p.getKey() == yearInput) {
                    leaderCount.add((String) p.getValue());
                }
            }
            System.out.println("\nWe found " + leaderCount.size() + " student leader(s) from year " + yearInput + " and here is the list:");

            // Enhanced for loop for printing leader found
            for (String name : leaderCount) {
                System.out.println(name);
            }

            System.out.print("\nDo you want to continue? [y or n]: ");
            proceed = input.nextLine();

            // While loop for only accepting 'y' or 'n'
            while(!proceed.equals("y")) {
                if (proceed.equals("n")) {
                    break;
                }

                System.out.print("\nDo you want to continue? [y or n]: ");
                proceed = input.nextLine();
            }
        }

        // Using the getRep function to take the years and leaders and find the year reps
        ArrayList<Pair> Rep = getRep_ChristopherMarcus(yearLeader);
        System.out.println("\nHere is the list of the class-reps.....");
        // Enhanced for loop to print rep for each year
        for (Pair pair : Rep) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

        footer();
    }
}
