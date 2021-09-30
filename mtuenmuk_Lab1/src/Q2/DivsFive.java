package Q2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/******************************************************************************
 * Marcus Tuen Muk
 * 251162913
 * Sept. 17, 2021
 * Create a method that will find the number of numbers divisible by 5.
 * Find the max, min, average out of them and print the number of divisible
 * by 5.
 * Compare their respective execution time
 *****************************************************************************/
public class DivsFive {
    /**
     * Lets the user populate an integer array that will be checked for the numbers divisible by 5.
     * Then print out the number of divisible by 5 and the max, min and average.
     * @param args
     */
    public static void main(String args[]){
        header(1,2);
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the size fo the array: ");
        int size = input.nextInt();
        int[] numArr = new int[size];

        for (int j = 0; j < size; j++){
            System.out.print("Please enter an integer: ");
            numArr[j] = input.nextInt();
        }

        double[] divsFive = mma5MethodMarcus(numArr);

        System.out.printf("The Max number is %.2f\nThe Min number is %.2f\nThe Average is %.2f\n",
                divsFive[0], divsFive[1], divsFive[2]);
        footer("Goodbye from Marcus Tuen Muk");
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
     * Finds the numbers that are divisible by 5 and the max, min, average out of them.
     * Will print the number of numbers divisible by 5
     * @param arr An integer array that will be checked for number divisible by 5
     * @return A double array that has the max, min, average, and student number
     */
    public static double[] mma5MethodMarcus(int[] arr){
        double max = 0, min = 0, average = 0, count = 0, studentNum = 251162913;

        for (double i: arr){
            if (i % 5 == 0){
                if (count == 0){
                    max = i;
                    min = i;
                    count++;
                }

                else{
                    if (i > max){
                        max = i;
                        count++;
                    }

                    else if (i < min){
                        min = i;
                        count++;
                    }
                }
                average += i;
            }
        }

        average /= count;

        System.out.printf("Marcus found %.2f numbers that are divisible-by-5\n", count);
        return new double[] {max, min, average, studentNum};
    }

    /**
     * This is a static method that prints a goodbye message
     * @param msg a goodbye message
     */
    public static void footer(String msg){
        System.out.printf("*** %s ***", msg);
    }
}
