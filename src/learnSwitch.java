import java.util.Scanner;

public class learnSwitch {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mini Calculator made using java");

        System.out.println("enter first number");
        double n1 = sc.nextDouble();
        System.out.println("enter second number");
        double n2 = sc.nextDouble();

        System.out.println("Select operations");
        System.out.println("enter 1: for + (Addition)");
        System.out.println("enter 2: for - (Subtraction)");
        System.out.println("enter 3: for * (Multiplication)");
        System.out.println("enter 4: for / (Division)");
        System.out.println("enter 5: for % (Modulus)");

        int operation = sc.nextInt();

        double result;
        switch (operation){
            case 1:
                result = n1 + n2;
                System.out.println("Result is" + n1 + "+" + n2 + "=" + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Result is" + n1 + "-" + n2 + "=" + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Result is" + n1 + "*" + n2 + "=" + result);
                break;
            case 4:
                if (n2!=0){
                    result = n1 / n2;
                    System.out.println("Result is" + n1 + "/" + n2 + "=" + result);
                }else{
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            case 5:
                if (n2!=0){
                    result = n1 % n2;
                    System.out.println("Result is" + n1 + "%" + n2 + "=" + result);
                }else{
                    System.out.println("Error: Modulus by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operation selected");
                break;
        }
    }
}
