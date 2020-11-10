import person.Person;
import personComparators.CompareToName;

import java.util.ArrayList;
import java.util.List;

public class AppLaunch {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Петр", 1234));
        people.add(new Person("Иван", 2334));
        people.add(new Person("Елена", 4321));
        people.add(new Person("Алена", 43));
        people.add(new Person("Андрей", 123234));
        people.add(new Person("Олег", 112));

        people.sort();

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
