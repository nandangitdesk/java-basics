public class RotatedHalfPyramid {
    public static void main(String[] args){
        int number = 5;
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= number - i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
