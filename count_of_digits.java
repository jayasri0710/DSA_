/*Write a program that gets n as input and print the number of digits in the number

Testcase 1 :

Input : 

325345

Expected output:

6*/
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt(),count=0;
    while(n>0){
      int ld=n%10;
      count=count+1;
      n=n/10;
    }
    System.out.print(count);
  }
}
