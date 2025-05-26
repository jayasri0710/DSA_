import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    while(n>0){
      int ld=n%10;
      System.out.println(n%10);
      n=n/10;
    }
  }
}
