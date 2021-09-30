package Q1L2;

import com.sun.jdi.IntegerValue;

import java.lang.reflect.Array;
import java.util.*;

public class testPair {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        header(2,1);
        ArrayList <Integer> years = new ArrayList(Arrays.asList(2,3,4,3,2,2));
        ArrayList <String> names = new ArrayList(Arrays.asList("Harry", "Lavender", "Ron",
                "Hermione", "Luna", "Vincent"));
        Pair[] students = new Pair[years.size()];

        for (int i = 0; i < years.size(); i++){
            students[i] = new Pair<Integer, String>(years.get(i), names.get(i));
        }

        System.out.println("Let’s check out the leaders from different year of program.");

        while (true) {
            System.out.print("From which academic year would you like to list the names of the leaders:");

            int year = in.nextInt();

            if (year < 2 || year > 4) {
                System.out.println("Invalid Entry! Enter a valid number between 2 and 4:");
            }

            int leaderCount = 0;
            ArrayList<String> leaders = new ArrayList();
            for (int i = 0; i < students.length; i++) {
                if (students[i].getKey().equals(year)) {
                    leaderCount++;
                    leaders.add((String) students[i].getValue());
                }
            }

            for (int i = 0; i < leaders.size(); i++) {
                System.out.println(leaders.get(i));
            }

            if (leaderCount > 0) {
                System.out.print("Do you want to Continue (y/n): ");
                char choice = in.next().charAt(0);
                if (choice == 'n') {
                    break;
                }
            }
        }

        footer("Goodbye from Marcus Tuen Muk!");
    }

    /**
     * This is a static method that tells user the lab number and question and my name
     * @param labNum lab number
     * @param quesNum question number
     */
    public static void header(int labNum, int quesNum){
        System.out.printf("*****************************************\n\t%s\n\tLab #%d, Question #%d" +
                "\n*****************************************\n", "Marcus Tuen Muk", labNum, quesNum);
    }

    /**
     * This is a static method that prints a goodbye message
     * @param msg a goodbye message
     */
    public static void footer(String msg){
        System.out.printf("*** %s ***", msg);
    }
}
