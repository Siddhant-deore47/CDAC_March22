import java.util.Scanner;

class RectOps{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle : ");
        float length = sc.nextFloat();
        System.out.println("Enter Breadth of Rectangle : ");
        float breadth = sc.nextFloat();
        float area = length*breadth;
        float perimeter = 2*(length+breadth);

        System.out.println("Area of Rectangle = "+area);
        System.out.println("Area of Rectangle = "+perimeter);

    }
}
