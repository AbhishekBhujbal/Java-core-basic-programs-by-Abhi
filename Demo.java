import java.util.Scanner;

public class Demo {

    static int factorial(int n,int r) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n :");
        int n = sc.nextInt();

        System.out.println("enter number r :");
        int r = sc.nextInt();

        System.out.println("factorial of" + n + "is :" + factorial(n,r));

    }

}
