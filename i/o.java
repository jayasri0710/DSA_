import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int wholenum=scan.nextInt();
        char letter=scan.next().charAt(0);
        Double frac=scan.nextDouble();
        String word=scan.next();
        System.out.println(wholenum);
        System.out.println(letter);
        System.out.println(frac);
        System.out.println(word);
  }
}

