import java.util.*;
public class FindMe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,item;
        System.out.println("Enter the element size: "); //n = 3
        n = sc.nextInt();

        int a[] = new int[n];//a indicates to array

        System.out.println("Enter " + n + " Element : "); //n = {10,20,30}
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be found : "); //20
        item = sc.nextInt();

        int foundIndex = -1;
        for(i=0;i<n;i++){
            if(a[i] == item){
                foundIndex = i;
                break;
            }
            

        }
        if(foundIndex != -1){
            System.out.println("Yes " + item + " element is found at index : "+ foundIndex + "!"); //yes is output 
        }else{
            System.out.println("Not found");
        }
    }
}
