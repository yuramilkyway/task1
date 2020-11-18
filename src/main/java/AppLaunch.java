import person.Person;
import personComparators.CompareToName;
import personComparators.CompareToSum;

import java.util.ArrayList;
import java.util.List;

public class AppLaunch {
    public static void main(String[] args) {
        List<Person> expected = new ArrayList<>();

        expected.add(new Person.Builder().setName("Испания").setSum(1717).build());
        expected.add(new Person.Builder().setName("Наталья").setSum(343).build());
        expected.add(new Person.Builder().setName("Янут").setSum(34222).build());
        expected.add(new Person.Builder().setName("Ослям").setSum(55543).build());

        System.out.println("Сортировка по имени");
        expected.sort(new CompareToName());
        for (Person person : expected) {
            System.out.println(person);
        }

        System.out.println("===========================================================");
        System.out.println("Сортировка по денежной сумме");
        expected.sort(new CompareToSum());
        for (Person person : expected) {
            System.out.println(person);
        }
    }
}
