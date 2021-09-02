import java.io.Serializable;
import java.time.YearMonth;

public class Person implements Serializable {
    private String name;
    private int age;
    private int birthday;
    private boolean isMale;
    public Person(String name, int name, int birthday, boolean isMale) {
        this.name = name;
        this.birthday = birthday;
        this.isMale = isMale;
        this.age = YearMonth.now().getYear() - birthday;
    }
    
} 