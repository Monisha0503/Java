import java.util.Scanner;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        // Convert to lowercase for uniform checking
        str = str.toLowerCase();

        // Boolean array to track presence of each letter
        boolean[] letters = new boolean[26];

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true; // Mark this letter as present
            }
        }

        // Verify if all letters are present
        boolean isPangram = true;
        for (boolean present : letters) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        // Output the result
        if (isPangram)
            System.out.println("The sentence is a Pangram.");
        else
            System.out.println("The sentence is NOT a Pangram.");

        sc.close();
    }
}