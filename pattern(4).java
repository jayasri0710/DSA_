import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i+1-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
