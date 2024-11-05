import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: How many rows you want");
        int a = sc.nextInt();
        System.out.println("Enter number: How many column you want");
        int b = sc.nextInt();

        System.out.println("Here is your SolidRectangle pattern");
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ; j <= b; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
