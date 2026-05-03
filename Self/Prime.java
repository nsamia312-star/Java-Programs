import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Boolean ans = IsPrime(n);
         System.out.println(ans);
         if(ans==false){ 
            System.out.println("The " +n+ " is not a prime number");
         }else{ 
            System.out.println("the " +n+ "  number is prime number");
            sc.close();
         }
       
    } 
     static Boolean IsPrime (int n ){ 
       //Boolean isprime = true;
       if(n<=1){ 
         return false;
       } 
       else{ 
        for(int i =2;i<n;i++){ 
            if(n%i==0){ 
                return false;
            }
        } return true;
        
       } 
    

        }
}
