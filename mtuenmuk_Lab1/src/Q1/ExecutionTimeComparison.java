package Q1;

/******************************************************************************
 * Marcus Tuen Muk
 * 251162913
 * Sept. 17, 2021
 * Create 2 methods that will find the factorial using recursion and iteration.
 * Compare their respective execution time
 *****************************************************************************/
public class ExecutionTimeComparison {

    /**
     * Driver method to run the methods and check the execution time for recursion and iterative
     * @param args
     */
    public static void main(String[] args){
        header(1,1);
        double start = System.nanoTime();
        System.out.printf("%.2f\n",reFactorial(30));
        double finish = System.nanoTime();
        double timeElapse = finish-start;
        System.out.printf("%.2f ns\n", timeElapse);

        start = System.nanoTime();
        System.out.printf("%.2f\n",itFactorial(30));
        finish = System.nanoTime();
        timeElapse = finish-start;
        System.out.printf("%.2f ns\n", timeElapse);

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
     * Finds the factorial of a given number by using a recursion
     * @param num the factorial number
     * @return the result of the factorial
     */
    public static double reFactorial(double num){
        if (num == 0){
            return 1;
        }

        return num*reFactorial(num-1);
    }

    /**
     * Finds the factorial of a given number by using an iterative method, for loop
     * @param num the factorial number
     * @return the result of the factorial
     */
    public static double itFactorial(double num){
        double fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }

        return fact;
    }

    /**
     * This is a static method that prints a goodbye message
     * @param msg a goodbye message
     */
    public static void footer(String msg){
        System.out.printf("*** %s ***", msg);
    }
}
