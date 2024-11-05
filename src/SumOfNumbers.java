import java.util.Scanner;

public class SumOfNumbers {
//    public static int sumOfNumbers(int a , int b){
//        int sum = a + b;
//        return sum;
//    }

//    public static int calculateProduct(int a , int b){
//        int product = a * b;
//        return product;
//    }

    public static void PrintFactorial(int n){
        if (n<0){
            System.out.println("Invalid number");
            return;
        }

        int factorial = 1;
        for (int i = n; i >=1 ; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        int sum = sumOfNumbers(a , b);
//        System.out.println("Sum of two number is :" + sum);

//        int product = calculateProduct(a , b);
//        System.out.println("Product of two number is :" + product);

        int n = sc.nextInt();

        PrintFactorial(n);

    }
}
