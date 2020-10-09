import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Please input a decimal number:");

        double x = scan.nextDouble();

        int y = (int)(x * 10) % 10;

        System.out.println(y);

        int z = (int) (x * 100) % 10;

        System.out.println(z);

    }
}