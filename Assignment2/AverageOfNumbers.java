import java.util.*;

class AverageOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double x = sc.nextDouble();
        System.out.println("Enter Second Number : ");
        double y = sc.nextDouble();
        System.out.println("Enter Third Number : ");
        double z = sc.nextDouble();
        double avg = (x+y+z)/3;

        System.out.println("Average of Three Numbers = "+avg);
    }
}

