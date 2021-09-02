import java.io.Serializable;
import java.time.YearMonth;

public class Person implements Serializable {
    private int id;
    private String name;
    private int age;
    private int birthday;
    private boolean isMale;
    public Person(String name, int birthday, boolean isMale) {
        this.name = name;
        this.birthday = birthday;
        this.isMale = isMale;
        this.age = YearMonth.now().getYear() - birthday;
    }
    // setter 
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setBirthday(int birthday) {
        this.birthday = birthday;
        this.age = YearMonth.now().getYear() - birthday;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
     
    // getter
    public String getName() {
        return this.name;
    }

    public int getBirtday() {
        return this.birthday;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getIsMale() {
        return this.isMale;
    } 
    
    public int getId() {
        return this.id;
    }
} 