import java.util.*;
public class Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num a : ");
        int a = sc.nextInt();

        System.out.print("enter num b : ");
        int b = sc.nextInt();

        System.out.print("enter operator : ");
        char o = sc.next().charAt(0);

        switch(o){
             
            case '+' -> System.out.println("addition of of two numbers is : "+ (a+b));

                        case '-' -> System.out.println("addition of of two numbers is : "+ (a-b));            
        }

        
    }
}