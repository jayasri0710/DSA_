import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.print(" ");
       }
    }
}
