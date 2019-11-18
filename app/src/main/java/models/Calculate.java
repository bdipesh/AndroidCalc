package models;

public class Calculate {
    int first, second;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Calculate(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int Add () {
        int addResult = first + second;
        return addResult;
    }

    public int Subract () {
        int addResult = first - second;
        return addResult;
    }
    public int Divide()
    {
        int addResult = first / second;
        return addResult;
    }
    public int Multiply () {
        int addResult = first * second;
        return addResult;
    }
}
