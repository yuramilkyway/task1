package personComparators;

import java.util.Comparator;

public class CompareToName implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

    @Override
    public Comparator<Integer> reversed() {
        return null;
    }
}
