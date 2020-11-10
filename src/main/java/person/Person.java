package person;

import java.util.Comparator;

public class Person implements Comparator<String>{
    private String name;
    private int sum;

    public Person(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sum=" + sum;
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
