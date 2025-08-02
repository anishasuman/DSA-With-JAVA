import java.util.*;
public class Deletion{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n , IdxVal;
        System.out.println("Enter the element no that to be stored: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n-1];
        System.out.println("Enter" + n + "Value: ");
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the index value to be deleted: ");
        IdxVal = sc.nextInt();

        for(int i=0 ; i<a.length;i++){
            if(i<IdxVal){
                b[i]=a[i];
            }
            else if(i==IdxVal){
                continue;
            }else{
                b[i-1] = a[i];
            }
        }
        System.out.println("Final elements enter: ");
        for(int i=0;i<n-1;i++){
            System.out.println(b[i]);
        }
    }
}