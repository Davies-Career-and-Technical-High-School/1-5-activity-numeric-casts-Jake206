import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a three digit number: ");
        
        int x = scan.nextInt();

        int y = x%10;

        System.out.println(y);

        int a = (x%100)/10;

        System.out.println(a);


        int z = x/100;

        System.out.println(z);


    }
}