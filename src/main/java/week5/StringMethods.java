
public class StringMethods{
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = s1.intern();

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s2 == s4: " + (s2 == s4));

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s3): " + s2.compareTo(s3));

        System.out.println("Substring from index 3: " + s1.substring(3));
        System.out.println("Substring from index 1 to 3: " + s1.substring(1, 3));

        System.out.println("Starts with 'Wel': " + s1.startsWith("Wel"));
        System.out.println("Ends with 'Java': " + s1.endsWith("Java"));

        System.out.println("Lower case: " + s1.toLowerCase());
        System.out.println("Upper case: " + s1.toUpperCase());
        System.out.println("Trim: '" + "   Hi?   ".trim() + "'");

        System.out.println("Replace 'o' with 'O': " + s1.replace('o', 'O'));
        System.out.println("Replace 'll' with 'oo': " + "Hello".replaceAll("ll", "oo"));

        String[] split1 = s1.split("O");
        String[] split2 = s1.split("O", 4);
        System.out.println("Split without limit: " + split1.length);
        System.out.println("Split with limit 4: " + split2.length);

        char[] charArray = s1.toCharArray();
        System.out.println("First char: " + charArray[0]);
        System.out.println("Code point at index 0: " + s1.codePointAt(0));

        System.out.println("Contains 'or': " + s1.contains("or"));

        System.out.println("HashCodes:");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}