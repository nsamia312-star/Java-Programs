import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        switch(day){ 
            case "Monday" -> System.out.println("Its the first day of the week");
            case "Tuesday" -> System.out.println("Second Day of the week");
        }

         
    }
}
