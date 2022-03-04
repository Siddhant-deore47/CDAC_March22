import java.util.Scanner;

class CircleOps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
        System.out.println("Enter Radius of Circle : ");
        float radius = sc.nextFloat();
        float area = pi*radius*radius;
        float perimeter = 2*pi*radius;

        System.out.println("Area of Circle = "+area);
        System.out.println("Area of Perimeter = "+perimeter);





    }
}
