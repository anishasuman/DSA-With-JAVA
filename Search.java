import java.util.*;
public class Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an element: ");
        n = sc.nextInt();

        int a[] = new int [n];
        System.out.println("Enter " + n + " Value : ");
        //traversing
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int small = a[0];//taking 1st element smallest

        //Logic of linear search to find smallest num
        for(int i = 0 ; i < n ; i++){
            if(a[i]<small){
                small = a[i];
            }
        }
        System.out.println("Smallest number in array is: " + small);
    }
}
