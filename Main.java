import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = null;
        Scanner sc = new Scanner(System.in);
        Manager mn = new Manager();
        boolean exit = false;
        show();
        while (true) {
            s = sc.nextLine();
            switch (s) {
                case "1":
                    mn.add();
                    break;
                case "2":
                    mn.remove();
                    break;
                case "3":
                    mn.edit();
                    break;
                case "4":
                    mn.show();
                    break;
                case "5":
                    mn.SortByAge();
                    break;
                case "6":
                    mn.SortByBirthday();
                    break;
                case "7":
                    System.err.println("Exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! Please choose action in below menu!");
                    break;
            }
            if (exit)
                break;
            show();
        }
        
    }
    public static void show() {
        System.out.println("--------Options------");
        System.out.println("1. Add a member.");
        System.out.println("2. Remove a member.");
        System.out.println("3. Edit a member.");
        System.out.println("4. Show all member.");
        System.out.println("5. Sort by age");
        System.out.println("6. Sort by birthday.");
        System.out.println("7. Exit.");    
        System.out.print("Please! Input: ");
    }
}
