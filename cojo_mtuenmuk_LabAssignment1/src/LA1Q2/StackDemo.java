package LA1Q2;

import java.util.Stack;
import java.util.*;

public class StackDemo {

    /**
     * Use header to print some basic information about the
     * question.
     * Creates an empty MyStack Obj and checks if it is empty.
     * Then populate the stack with 2 students' information.
     * Next print out the top value of the stack and
     * Then find the student number of the first student and
     * Its location. Finally, print out the information using
     * footer.
     * @param args
     */
    public static void main(String[] args){
        header();

        System.out.println("Revisiting the concept of Stack.....");


        MyStack<String> strStack = new MyStack<>(0);
        if (strStack.empty())
            System.out.printf("The stack is Empty! The stack: %s\n", strStack);

        System.out.println("Pushing the String values to the stack....");

        strStack.push("251162913");
        strStack.push("Tuen Muk");
        strStack.push("Marcus");
        strStack.push("251168901");
        strStack.push("Ojo");
        strStack.push("Christopher");


        System.out.printf("The stack: %s\n", strStack);
        System.out.printf("The value at the top is: %s\n", strStack.peek());
        System.out.println("Searching for 251168901....");
        int distance = strStack.search("251168901");
        System.out.printf("The item has been found in distance %d with reference to the top\n",
                distance);

        MyStack<String> tempStack = new MyStack<>(distance);
        String findValue = "";
        int counter = 0;
        for (int i = 0; i <distance; i++){
            tempStack.push(strStack.pop());
            findValue = tempStack.peek();
        }
        System.out.println(findValue);
        for (int i = 0; i < distance; i++){
            strStack.push(tempStack.pop());
        }

        footer(strStack);
    }

    /**
     * Used to print out the information of the students and the goal of this question
     */
    public static void header(){
        System.out.println("\t*******************************************************\n" +
                "\tNames: Christopher and Marcus.\n" +
                "\tStudent Numbers: studentNumber1 and 251162913\n" +
                "\tGoal of this project: The goal of the project is to\n" +
                "\tInvestigate our understanding of stacks through\n" +
                "\tCreating a generic stack class with the following:\n" +
                "\t 1. a method to check if the stack is empty\n" +
                "\t 2. a method to check the top element of the stack\n" +
                "\t 3. a method to remove to top element of the stack\n" +
                "\t 4. a method to add items to the stack\n" +
                "\t 5. a method to find a specific item in the stack\n" +
                "\t 6. an override of the toString\n" +
                "\tAnd finally test it out by using a test case\n" +
                "\t*******************************************************\n");
    }

    /**
     * Used to print out the information of the students from the stack and status of the stack
     * @param stack is a MyStack Obj that has the information of the students.
     */
    public static void footer(MyStack stack){
        System.out.println(stack);
        System.out.printf("Team Member 1 info.....\n\tFirst Name: %s\n\tLast Name: %s\n\tStudent Number: %s\n",
                stack.pop(), stack.pop(),stack.pop());
        System.out.printf("Team Member 2 info.....\n\tFirst Name: %s\n\tLast Name: %s\n\tStudent Number: %s\n",
                stack.pop(), stack.pop(),stack.pop());
        System.out.println("Here is the status of the Stack...");
        System.out.printf("The stack is Empty! The stack: %s\nGoodbye!", stack.toString());
    }
}
