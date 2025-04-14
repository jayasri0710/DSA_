import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    if(a+b+c==180){
      System.out.print("triangle can be formed");
    }
    else{
      System.out.print("triangle cannot be formed");
    }
  }
}