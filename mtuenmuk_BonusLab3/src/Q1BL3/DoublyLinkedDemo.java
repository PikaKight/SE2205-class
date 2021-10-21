package Q1BL3;

public class DoublyLinkedDemo{
    public static void main(String[] args){
        header(1, 1);
        DoublyLinkedList<Student> marcusList = new DoublyLinkedList<Student>();

        Student s1 = new Student("Harry", 67.35);
        Student s2 = new Student("Luna", 87.5);
        Student s3 = new Student("Vincent", 60.5);
        Student s4 = new Student("Hermione", 89.2);

        marcusList.addLast(s1);
        marcusList.addLast(s2);
        marcusList.addLast(s3);

        System.out.println(marcusList);

        System.out.println("Adding 4th student in between.....");

        marcusList.addBetween(s4, marcusList.findNode(s2), marcusList.findNode(s3));

        System.out.println(marcusList);

        footer("Goodbye from Marcus Tuen Muk!");
    }
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