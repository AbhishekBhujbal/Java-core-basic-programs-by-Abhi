import java.util.*;
public class MaxOf3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num a : ");
        int a = sc.nextInt();

        System.out.print("enter num b : ");
        int b = sc.nextInt();

        System.out.print("enter num c : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("the maximum number is a ");
        }else if(b>a && b>c){
            System.out.println("the maximum number is b ");
        }else{
            System.out.println("the maximum number is c ");
        }

        
        
    }
}