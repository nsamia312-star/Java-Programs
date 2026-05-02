public class CountNumbs {
    public static void main(String[] args) {
        int n = 133338;
        int count =0;
        System.out.println("Heloo");
        while (n>0){ 
            int rem = n % 10; // checks last digit 
            if(rem == 3){ 
                count++;
            } n = n/10; // removes last digit 
 
        } System.out.println(count);
    } 
}
