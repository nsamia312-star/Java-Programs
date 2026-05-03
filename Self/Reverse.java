import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
         System.out.println("Enter a number : " );
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n>0){ 
            int rem = n%10;
            n = n/10;
            answer = answer *10 +rem;

        }
        System.out.println("The Reverse of the number is :" +answer);
        sc.close();
    }
}
