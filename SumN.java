import java.util.*;
public class SumN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num : ");
        int num = sc.nextInt();

        int sum =0;
        for(int i =1;i<=num ; i++){
            sum = sum +i;
            
            System.out.println(sum);
        }
        }
}