import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        System.out.println("Enter a char:");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // trim removes the extra spaces
                                                     // reads the first letter only chat at index 0                                   
        if(ch>= 'a' && ch<= 'z'){ 
            System.out.println("It is a LowerCase Letter");
        } 
        else { 
            System.out.println("It is UpperCase Letter");
        }

    }
}
