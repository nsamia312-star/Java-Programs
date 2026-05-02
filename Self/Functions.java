import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
       sum();
       int ans =  minuss();
        System.out.print("The answer is:" +minuss());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int c = sc.nextInt();
        System.out.print("Enter the second number: ");
        int d = sc.nextInt();
          System.out.println("The answer is:" +divide(c, d));

    } 
    // **** VOID TYPE **** //
     static void sum(){ 
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a +b;
        System.out.println("The sum of the numbers is: "+ sum);
    } 
   // **** RETURN TYPE **** //
     static int minuss(){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int minus = a - b;
        return minus;
    } 
    // **** ARGUEMENTS **** //
    static int divide(int a,int b){ 
         
        int division = a / b;
        return division;
    }
}
