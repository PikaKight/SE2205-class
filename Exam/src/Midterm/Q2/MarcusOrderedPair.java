package Midterm.Q2;

public class MarcusOrderedPair <T> implements PairableInterface<T>{
    private T first;
    private T second;

    MarcusOrderedPair(){
    }

    @Override
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", this.first, this.second);
    }
}
