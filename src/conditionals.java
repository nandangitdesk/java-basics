import java.util.Scanner;

public class conditionals {
   public static void  main (String[] args){
       Scanner sc = new Scanner(System.in);
       int Age = sc.nextInt();

       if (Age > 18 ){
           System.out.println("Adult");
       }else{
           System.out.println("not Adult");
       }
   }
}
