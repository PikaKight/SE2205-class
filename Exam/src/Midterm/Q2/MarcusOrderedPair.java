package Midterm.Q2;

public class MarcusOrderedPair <T> implements PairableInterface{
    private T first;
    private T second;

    MarcusOrderedPair(){
    }

    @Override
    public void setPair(Object first, Object second) {
        PairableInterface.super.setPair(first, second);
        this.first = (T) first;
        this.second = (T) second;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", this.first, this.second);
    }
}
