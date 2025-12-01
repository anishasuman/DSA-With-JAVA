import java.util.*;
public class Hours {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the hours (0–23) ");
        int h = sc.nextInt();
        System.out.println("Enter the minutes (0–59): ");
        int m = sc.nextInt();

        if(h<12){
            System.out.println("AM");
        }else{
            System.out.println("PM");
        }
    }
}
