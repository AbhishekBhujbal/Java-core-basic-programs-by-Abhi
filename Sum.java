import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num a : ");
        int a = sc.nextInt();

        System.out.print("enter num b : ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("sum of two numbers is : " + sum);
    }
}