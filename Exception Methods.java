public class ExceptionClass {
 public static void main(String[] args) {
 System.out.println("Monisha/2024503043");
 double a = 5.0 / 0;
 System.out.println("I am executable");
 try {
 int b = 5 / 0;
 System.out.println("I am not executable");
 } catch (ArithmeticException ae) {
 System.out.println(ae + "\n I am at catch ArithmeticException");
 } finally {
 int b = 0;
 System.out.println("Exception caught");
 }
 System.out.println("I am after try catch");
//NullPointerException
 String str = null;
 try {
 System.out.println(str.length());
 } catch (NullPointerException e) {
 System.out.println("caught a NullPointerException");
 }
 //NumberFormat
 String numStr1 ="2024";
 try {
 int num = Integer.parseInt(numStr1);
 System.out.println("Parsed number: " + num);
 } catch (NumberFormatException nfe) {
 System.out.println("Caught your NumberFormatException (2024): " + nfe.getMessage());
 }
 }
}