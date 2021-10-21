package Q1BL3;

public class Student {
    private String firstName;
    private Double score;

    public Student(String firstName, Double score){
        this.firstName = firstName;
        this.score = score;
    }

    @Override
    public String toString() {
        return firstName + ": " + score;
    }
}
