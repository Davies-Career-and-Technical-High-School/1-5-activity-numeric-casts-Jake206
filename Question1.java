import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a two digit number: ");
        
        int x = scan.nextInt();

        int y = x/10;

        System.out.println(y);

        int z = x%10;

        System.out.println(z);

        

        

    }
}