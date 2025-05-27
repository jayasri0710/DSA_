import java.util.Scanner;
public class lastdigit{
 public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int lastdigit=n%10;
   System.out.print(lastdigit);
 }
}