import java.util.Scanner;

class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();

        String result=(n%2==0? "even":"odd");

        System.out.println(result);
      

    }
    
}
