import java.util.*;

class arithOps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int y = sc.nextInt();


        System.out.println("Addition = "+(x+y));
        System.out.println("Subtraction = "+(x-y));
        System.out.println("Multiplication = "+(x*y));
        System.out.println("Division = "+(x/y));
        System.out.println("Remainder = "+(x%y));
    }
}
