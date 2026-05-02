import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char op;
        System.out.print("*** BASIC CALCULATOR ***");
        System.out.println("     ");
        do { 
                System.out.print("Enter Number one: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Number two: ");
                int num2 = sc.nextInt();
                System.out.println("Select the operator");
                 op = sc.next().charAt(0);
                switch (op) {
                    case '+':
                        System.out.println("The addition of two numbers is:" + (num1+num2));    
                    break;
                    case '-':
                        System.out.println("The Subtraction of two numbers is:" + (num1-num2));    
                    break;
                    case '*':
                        System.out.println("The Multiplication of two numbers is:" + (num1*num2));    
                    break;
                    case '/':
                        if(num2!=0){
                         System.out.println("The Division of two numbers is:" + (num1/num2));
                        } else {
                            System.out.println("The Answer is Infinity");
                        }      
                    break;
                    case '%':
                        System.out.println("The Reminder of two numbers is:" + (num1%num2));    
                    break;
                    case 'x':
                        System.out.println("-----Calculator Exited-----");
                
                    default:
                        System.out.println("Invalid Operator");
                        break;
                }


        } while (op!='x');
    }
}
