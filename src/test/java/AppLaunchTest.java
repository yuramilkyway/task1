import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import person.Person;
import personComparators.CompareToName;
import personComparators.CompareToSum;

import java.util.ArrayList;
import java.util.List;

public class AppLaunchTest {
    private final List<Person> expected = new ArrayList<>();
    private final List<Person> actual = new ArrayList<>();

    @Before
    public void setUp() {
        expected.add(new Person.Builder().setName("Испания").setSum(1717).build());
        expected.add(new Person.Builder().setName("Наталья").setSum(343).build());
        expected.add(new Person.Builder().setName("Янут").setSum(34222).build());
        expected.add(new Person.Builder().setName("Ослям").setSum(55543).build());
        expected.add(new Person.Builder().setName("Микола").setSum(34652).build());
        expected.add(new Person.Builder().setName("Алла").setSum(34).build());
    }

    @Test
    public void positiveSortToNameTest() {
        actual.add(new Person.Builder().setName("Алла").setSum(34).build());
        actual.add(new Person.Builder().setName("Испания").setSum(1717).build());
        actual.add(new Person.Builder().setName("Микола").setSum(34652).build());
        actual.add(new Person.Builder().setName("Наталья").setSum(343).build());
        actual.add(new Person.Builder().setName("Ослям").setSum(55543).build());
        actual.add(new Person.Builder().setName("Янут").setSum(34222).build());

        expected.sort(new CompareToName());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void positiveSortToSumTest() {
        actual.add(new Person.Builder().setName("Алла").setSum(34).build());
        actual.add(new Person.Builder().setName("Наталья").setSum(343).build());
        actual.add(new Person.Builder().setName("Испания").setSum(1717).build());
        actual.add(new Person.Builder().setName("Янут").setSum(34222).build());
        actual.add(new Person.Builder().setName("Микола").setSum(34652).build());
        actual.add(new Person.Builder().setName("Ослям").setSum(55543).build());

        expected.sort(new CompareToSum());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void identicalNameSortToNameTest() {
        final List<Person> expectedIdenticalName = new ArrayList<>();
        expectedIdenticalName.add(new Person.Builder().setName("Наталья").setSum(1717).build());
        expectedIdenticalName.add(new Person.Builder().setName("Наталья").setSum(343).build());
        expectedIdenticalName.add(new Person.Builder().setName("Наталья").setSum(34222).build());
        expectedIdenticalName.add(new Person.Builder().setName("Наталья").setSum(55543).build());
        expectedIdenticalName.add(new Person.Builder().setName("Наталья").setSum(34652).build());
        expectedIdenticalName.add(new Person.Builder().setName("Наталья").setSum(34).build());

        final List<Person> actualIdenticalName = new ArrayList<>();
        actualIdenticalName.add(new Person.Builder().setName("Наталья").setSum(1717).build());
        actualIdenticalName.add(new Person.Builder().setName("Наталья").setSum(343).build());
        actualIdenticalName.add(new Person.Builder().setName("Наталья").setSum(34222).build());
        actualIdenticalName.add(new Person.Builder().setName("Наталья").setSum(55543).build());
        actualIdenticalName.add(new Person.Builder().setName("Наталья").setSum(34652).build());
        actualIdenticalName.add(new Person.Builder().setName("Наталья").setSum(34).build());

        expectedIdenticalName.sort(new CompareToName());
        Assert.assertEquals(expectedIdenticalName, actualIdenticalName);
    }

    @Test
    public void identicalNameSortToSumTest() {
        final List<Person> expectedIdenticalSum = new ArrayList<>();
        expectedIdenticalSum.add(new Person.Builder().setName("Алла").setSum(343).build());
        expectedIdenticalSum.add(new Person.Builder().setName("Наталья").setSum(343).build());
        expectedIdenticalSum.add(new Person.Builder().setName("Испания").setSum(343).build());
        expectedIdenticalSum.add(new Person.Builder().setName("Янут").setSum(343).build());
        expectedIdenticalSum.add(new Person.Builder().setName("Микола").setSum(343).build());
        expectedIdenticalSum.add(new Person.Builder().setName("Ослям").setSum(343).build());

        final List<Person> actualIdenticalSum = new ArrayList<>();
        actualIdenticalSum.add(new Person.Builder().setName("Алла").setSum(343).build());
        actualIdenticalSum.add(new Person.Builder().setName("Наталья").setSum(343).build());
        actualIdenticalSum.add(new Person.Builder().setName("Испания").setSum(343).build());
        actualIdenticalSum.add(new Person.Builder().setName("Янут").setSum(343).build());
        actualIdenticalSum.add(new Person.Builder().setName("Микола").setSum(343).build());
        actualIdenticalSum.add(new Person.Builder().setName("Ослям").setSum(343).build());

        expectedIdenticalSum.sort(new CompareToSum());
        Assert.assertEquals(expectedIdenticalSum, actualIdenticalSum);
    }
}