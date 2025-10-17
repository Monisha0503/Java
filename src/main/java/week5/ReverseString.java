// Exercise 2: Reverse a string
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int n = ch.length;
        
        for (int i = 0; i < n / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[n - i - 1];
            ch[n - i - 1] = temp;
        }
        
        System.out.println("Reversed string: " + new String(ch));
        sc.close();
    }
}