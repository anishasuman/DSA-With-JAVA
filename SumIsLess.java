import java.util.*;
public class SumIsLess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();
        int c = (a+b);
        if(c<100){
            System.out.println("Sum is : "+c);
        }else{
            System.out.println("Nothing");
        }
    }
}
