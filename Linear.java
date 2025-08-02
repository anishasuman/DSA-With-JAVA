import java.util.Scanner;
public class Linear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n , i , item , C=0 ;
        System.out.println("How many items do you want to search  : ");
        n = sc.nextInt();

        int [] a = new int[n];
        System.out.println("Enter element: ");

        for(i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter item: ");
        item = sc.nextInt();

        for(i=0;i<a.length;i++){
            if(a[i]==item){
                C++;
                break;
            }

        }
        if(C>0){
            System.out.println("Item exists at index : " + i);
        }else{
            System.out.println("Does not exists.");
        }
    }
}
