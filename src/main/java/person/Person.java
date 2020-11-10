package person;

public class Person {
    private String name;
    private int sum;

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public Person(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sum=" + sum;
    }
}
