import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks=sc.nextInt();

        String result=(marks>=35? "pass":"Fail");
        System.out.println(result);
    }
}
