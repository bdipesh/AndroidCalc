package models;

public class Calculate {
    int first, second;
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
