import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    // tried to make 2d array in new way but got failed 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3];
        System.out.println("Enter the arrays :");
        for(int i =0;i<3;i++){
            arr[i] = sc.nextInt();
            
        }System.out.println(Arrays.toString(arr));
        for(int i =0;i<3;i++){
                        arr2[i] = sc.nextInt();

        }            System.out.println(Arrays.toString(arr2));

        for(int i =0;i<3;i++){
                        arr3[i] = sc.nextInt();

        }             System.out.println(Arrays.toString(arr3));

    }
}
