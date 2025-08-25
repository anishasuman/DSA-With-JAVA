import java.util.*;
import java.lang.*;
import java.io.*;

class Coin {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();   // no of test cases
        
        while(T > 0) {
            long N = sc.nextLong();   // total coins
            
            long beg = 1, end = N, ans = 0;
            
            while(beg <= end) {
                long mid = (beg + end) / 2;
                
                // total coins needed for mid height triangle = mid*(mid+1)/2
                long coinsNeeded = mid * (mid + 1) / 2;
                
                if(coinsNeeded <= N) {
                    ans = mid;      // mid height 
                    beg = mid + 1;  // for bigger height
                } else {
                    end = mid - 1;  // reduce height
                }
            }
            
            System.out.println(ans);
            T = T - 1;  // decrease test case count
        }
    }
}
