import java.util.*;
public class FirstOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , index , i;
        System.out.println("Enter the size : ");
        n = sc.nextInt();

        int a[] = new int[n]; //a=array={10,20,30,40,50}
        System.out.println("Enter " + n + " Number : ");
        for(i=0;i<n;i++){ //we r traversing
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: "); //20 and second input 60
        index = sc.nextInt();

        boolean found = false;

        for(i=0;i<n;i++) {
            if (a[i] == index) {
                System.out.println("Yes it found and its index number is : " + " " + i); //Yes and index is 1 & second output = Not found
                found = true;
                break;
            }
        }

            if(!found) { // ! means not  
                System.out.println("Not Found!");
            }

    }
}

