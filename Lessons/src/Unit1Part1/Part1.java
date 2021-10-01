package Unit1Part1;

import java.util.Scanner;

public class Part1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.printf("%.2f %.2f", recFactorial(30), itFactorial(30));

        System.out.print("\nWhat is the advantage of recursive approach\n" +
                "than an iterative approach?");
        String ans = in.next();

        if (ans == "Less code and easy to implement"){
            System.out.println("right");
        }
    }

    public static double recFactorial(int n){
        if (n == 0){
            return 1;
        }
        return n*recFactorial(n-1);
    }

    public static double itFactorial(int n){
        double result = 1;

        for (double i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
