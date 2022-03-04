import java.util.*;

class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int y = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("First Number : "+x);
        System.out.println("Second Number : "+y);

        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping");
        System.out.println("First Number : "+x);
        System.out.println("Second Number : "+y);
    }
}
