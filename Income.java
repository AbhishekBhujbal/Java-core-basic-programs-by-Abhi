import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income in lakhs:");
        int n = sc.nextInt();

        if(n<=5){
            System.out.println("tax is zero 0% ");
        }
        else if(n>=5 && n<=10){
            System.out.println("tax is 20% ");

        }
        else if(n>10){
            System.out.println("tax is 30% ");

        }
    }
    
}
