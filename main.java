import java.SYMarks;
import java.TYMarks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            
            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("SY - Computer Total Marks: ");
            int syComputerTotal = sc.nextInt();
            System.out.print("SY - Maths Total Marks: ");
            int syMathsTotal = sc.nextInt();
            System.out.print("SY - Electronics Total Marks: ");
            int syElectronicsTotal = sc.nextInt();
            SYMarks syMarks = new SYMarks(syComputerTotal, syMathsTotal, syElectronicsTotal);
            
            System.out.print("TY - Theory Marks: ");
            int tyTheory = sc.nextInt();
            System.out.print("TY - Practicals Marks: ");
            int tyPracticals = sc.nextInt();
            TYMarks tyMarks = new TYMarks(tyTheory, tyPracticals);
            
            students[i] = new Student(rollNumber, name, syMarks, tyMarks);
        }
        
        System.out.println("\nResults:");
        for (Student student : students) {
            student.displayResult();
            System.out.println();
        }
        
        sc.close();
    }
}
