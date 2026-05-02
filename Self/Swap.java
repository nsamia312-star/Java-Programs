public class Swap {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 56;
        arr[1]= 67;
        arr[2]= 89;
        arr[3]=90;
        arr[4]=78;
        for(int y : arr){ 
            System.out.print(y+ " ");
        }  
        System.out.println(" ");
        swap(arr, 2, 4);
        for(int y : arr){ 
            System.out.print(y+ " ");
        } 
        System.err.println(" ");
        System.out.println("The max number is: "+Max(arr)); 
    }
    
    static void swap(int[] arr,int in1,int in2){ 
        int temp = arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=temp;
    } 
    
    static int Max(int [] arr){
         int max =arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){ 
                max = arr[i];
            }
        } return max;
    }
}
