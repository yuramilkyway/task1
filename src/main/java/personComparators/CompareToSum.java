package personComparators;

import person.Person;

import java.util.Comparator;

public class CompareToSum implements Comparator<Person> {

    private int compareInt(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return compareInt(o1.getSum(), o2.getSum());
    }
}
