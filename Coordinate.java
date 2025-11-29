import java.util.*;
public class Coordinates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x value : ");
        int x = 0;
        x = sc.nextInt();

        int y = 0;
        System.out.println("Enter the y value : ");
        y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("Quadrant I");
        }else if(x<0 && y>0){
            System.out.println("Quadrant II");
        }else if(x<0 && y<0){
            System.out.println("Quadrant III");
        }else{
            System.out.println("Quadrant IV");
        }

    }
}
