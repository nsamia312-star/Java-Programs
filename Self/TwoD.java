import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2D array: " );
        int[][] arr = new int[3][3];
        for(int i = 0;i<arr.length;i++){ 
            
            for(int j =0;j<arr.length;j++){ 
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    
}
