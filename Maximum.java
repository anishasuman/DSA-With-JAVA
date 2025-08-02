import java.util.*;

class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  

        for (int m = 0; m < T; m++) {
            int N = sc.nextInt();  // N = no of mountains
            int[] a = new int[N]; // a=array

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();  // height 
            }

            int max = 0;  // 

            for (int i = 1; i < N; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }

            System.out.println(max);  // tallest mountain
        }

        
    }
}
