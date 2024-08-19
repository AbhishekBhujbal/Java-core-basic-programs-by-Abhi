import java.util.*;
public class IncomeTaxCal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if(n <= 5){
            System.out.println("Tax is zero percent");
        }else if(n>=5 && n<=10){
            System.out.println("tax is 20 percent");
        }else if(n>10){
            System.out.println("tax is 30 percent");
        }
    }
}