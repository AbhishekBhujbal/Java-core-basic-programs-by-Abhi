import java.util.*;
public class PassFailResult{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if(n <= 35){
            System.out.println("Fail");
        }else if( n>=35){
            System.out.println("Pass");
        }
    }
}