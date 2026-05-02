import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
      /*   arr[0]=78;
        arr[1]=79;
        arr[2]=78;
        arr[3]=78;
        arr[4]=78;
        for(int y : arr){ // enhanced for loop or for each loop
            System.out.print(y+ " "); 
        } */
       // int[] arry;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arry:" + " ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        } System.out.println(Arrays.toString(arr)); // method to print arrays
    /*     for(int b:arr){
            System.out.print(b + " ");
        } */ 
       // Object Arrays
       System.out.print("Enter string array: " + " ");
       String[] arry = new String[4];
       for(int i = 0 ;i<arry.length;i++){
        arry[i] = sc.next();
       } 
       System.out.println(Arrays.toString(arry));
       // modification 
       arry[3] = "Him";
              System.out.println(Arrays.toString(arry));




       
    }
}
