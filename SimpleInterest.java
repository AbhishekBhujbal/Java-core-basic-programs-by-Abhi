import java.util.*;
public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num principal amount : ");
        int p = sc.nextInt();

        System.out.print("enter num Rate : ");
        int R = sc.nextInt();

        System.out.print("enter num Time  : ");
        int T = sc.nextInt();

        int SI= p*R*T/100;
        System.out.println("Simple interest is : "+ SI);
    }
}
