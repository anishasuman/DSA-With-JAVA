//Q.Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
import java.util.*;
public class AlphabetChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char : ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'm'){
            System.out.println(ch +" " + "Yes it is b/w the given letter a and m");
        }else if(ch >='n' && ch<='z'){
            System.out.println(ch + " " + "It is  b/w the letter n and z");
        }else{
            System.out.println("Invalid input");
        }

    }
}
