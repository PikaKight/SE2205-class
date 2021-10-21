package LA1Q2;

import java.util.Arrays;

/**
 * A general type stack that has 2 private variables that represents the stack and the size respectively.
 * @param <E> The general class type that will be replaced with the initialized class type
 */
public class MyStack <E>{
    private Object[] objectArray;
    private int length;

    /**
     * Constructor for the MyStack class that sets the size of the stack to the given size
     * @param length An Int that represents the size of the stack
     */
    public MyStack(int length){
        this.length = length;
        objectArray = new Object[this.length];
    }

    /**
     * Checks if the stack is empty.
     * @return True if stack is empty, False if stack contains an element.
     */
    public boolean empty(){
        for(Object obj: objectArray){
            if(obj != null){
                return false;
            }
        }
        return true;
    }

    /**
     * It looks at the top of the stack without removing it
     * @return The top E type element of the stack
     */
    public E peek(){

        E top = (E) this.objectArray[this.length-1];
        return top;
    }

    /**
     * Removes the top element of the stack and reduces the stack size by 1
     * @return The E type element that has been removed
     */
    public E pop(){
        E top = (E)this.objectArray[this.length - 1];
        Object[] newArr = Arrays.copyOf(objectArray, this.length-1);
        this.objectArray = newArr;
        this.length -= 1;
        return top;
    }

    /**
     * Inserts the new value at the end of the object array and pushes all values in front of it.
     * This lets the new value be at the top of the stack.
     * @param value The E type element that will be at the top of the stack
     * @return The E type element
     */
    public E push(E value){
        Object[] newArr = new Object[this.length+1];
        for(int i=0; i < newArr.length - 1; i++){
            newArr[i] = this.objectArray[i];
        }
        newArr[newArr.length-1] = value;
        this.length += 1;
        this.objectArray = newArr;
        return value;
    }

    /**
     * Searches for the given value and finds the locations relative to the top of the stack
     * @param value E type element that is being searched
     * @return Int 1-based position relative to the top of the stack
     */
    public int search(E value){
        for (int i = 0; i < this.length; i++){
            if (this.objectArray[i].equals(value)){
                return this.length - i;
            }
        }
        return -1;
    }

    /**
     * Turns the object array into a string
     * @return The string object array
     */
    @Override
    public String toString() {
        return Arrays.toString(this.objectArray);
    }
}
