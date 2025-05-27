import java.util.Scanner;
public class sumofcorner{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int lastdigit=n%10;
    int firstdigit=0;
    while(n>0){
      firstdigit=n%10;
      n=n/10;
    }
   int sum=firstdigit+lastdigit;
    System.out.print(sum);
  }
}