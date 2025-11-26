import java.util.*;
public class AllTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter the first value: ");
        a = sc.nextInt();
        System.out.println("enter the second value: ");
        b = sc.nextInt();
        System.out.println("enter the third value: ");
        c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid Triangle");
            if (a == b && b == c) {
                System.out.println("Valid for equilateral triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("valid for isosceles triangle");
            } else {
                System.out.println("Valid for Scalene triangle  ");
            }
        }
        else{
                System.out.println("Not valid");
            }

        }
}
