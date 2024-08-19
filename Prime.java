import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
      

        if (num <= 1) {
            System.out.println("Number is not prime.");
        } else if (num == 2) {
            System.out.println("Number is prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= num-1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                   
                }
            }
            if (isPrime) {
                System.out.println("Number is prime.");
            } else {
                System.out.println("Number is not prime.");
            }
        }
    }
}
