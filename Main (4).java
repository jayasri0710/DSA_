import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the student's mark: "); 
        int a = scan.nextInt();

        if (a >= 90) {
            System.out.print("Grade A");
        } else if (a >= 80) {
            System.out.print("Grade B");
        } else if (a >= 60) {
            System.out.print("Grade C");
        } else if (a >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }

        
    }
}
