import java.util.Comparator;

public class SortByDay implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getBirtday() > person2.getBirtday())
        return 1;
        return -1;
    }
}
