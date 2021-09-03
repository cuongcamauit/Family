import java.text.NumberFormat.Style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Manager {
    public static Scanner sc = new Scanner(System.in);
    private List<Person> list;
    private SFile sFile;
    public Manager() {
        sFile = new SFile();
        list = sFile.read();
    }
    public void add() {
        int id = (list.size()>0) ? (list.size()+1) : 1;
        System.out.println("Person Id: " + id);
        String name = inputName();
        int birthday = inputBirthday();
        boolean ismale = inputSex();
        Person person = new Person(name, birthday, ismale);
        person.setId(id);
        list.add(person);
        sFile.write(list);        
    }

    public void remove() {
        int id = inputId();
        Person person = null;
        for (int i=0;i<list.size();i++)
        if (list.get(i).getId() == id) {
            person = list.get(i);
            break;
        }
        if (person!=null) {
            list.remove(person);
            sFile.write(list);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }

    }

    public void edit() {
        int id = inputId();
        for (int i=0;i<list.size();i++) 
        if (list.get(i).getId() == id) {
            list.get(i).setName(inputName());
            list.get(i).setBirthday(inputBirthday());
            list.get(i).setIsMale(inputSex());
        }
        sFile.write(list);
    }

    public void SortByAge() {
        Collections.sort(list, new Comparator<Person>(){
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getAge() > person2.getAge())
                return 1;
                return -1;
            }
        });
    }

    public void SortByBirthday() {
        Collections.sort(list, new SortByDay());
    }

    public void show() {
        for (Person person: list) {
            System.out.printf("|%-5d|%-20s|%10d|%5d|%n", person.getId(), person.getName(), person.getBirtday(), person.getAge());
        }
    }
    public String inputName() {
        System.out.print("Input name: ");
        return sc.nextLine();
    }

    public int inputId() {
        System.out.print("Input Id: ");
        while (true) {
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    public int inputBirthday() {
        System.out.print("Input birthday: ");
        while (true) {
            try {
                int birthday = Integer.parseInt((sc.nextLine()));
                return birthday;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    public boolean inputSex() {
        System.out.print("Are you male(y/n): ");
        String ss = sc.nextLine();
        return true;
    }
}
