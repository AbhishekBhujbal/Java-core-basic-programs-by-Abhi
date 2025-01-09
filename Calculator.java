import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter value a :");
        int a = sc.nextInt();

        System.out.println("enter value b :");
        int b = sc.nextInt();
       
        System.out.println("enter operator :");
        String  op = sc.next();

        switch (op) {
            case "add" :
                System.out.println("addition is :"+ (a+b));                
                break;

                case "sub" :
                System.out.println("addition is :"+ (a-b));                
                break; case "mul" :
                System.out.println("addition is :"+ (a*b));                
                break;
                case "div" :
                System.out.println("addition is :"+ (a/b));                
                break;
        
            default:
                System.out.println("enter wrong operator");
                break;
        }
    }
    
}
