public class MathCalculator {
 public static double calculatePower(int base,int exponent)
 {
 if(base==0&&exponent>0)
 {
 throw new IllegalArgumentException("base 0 with negative exponent is invalid");
 }
 else if(base<0&&exponent<0)
 {
 throw new ArithmeticException("both base and exponent are negative");
 }
 else if(base==0&&exponent==0)
 {
 throw new UnsupportedOperationException(" 0^0 is undefined");
 }
 return Math.pow(base,exponent);
 }
 public static long factorial(int n)
 {
 if(n<0)
 {
 throw new IllegalArgumentException("factorial not defined for negative numbers");
 }
 else if (n>20)
 {
 throw new ArithmeticException("Factorial overflow");
 }
 long result=1;
 for(int i=1;i<=n;i++)
 {
 result*=i;
 }
 return result;
 }
 public static double safeDivide(double dividend,double divisor)
 {
 if(divisor==0.0)
 {
 throw new ArithmeticException("cannot divide by zero");
 }
 else if(dividend==0.0 && divisor==0.0)
 {
 throw new IllegalArgumentException("both dividend and divisor are zero ");
 }
 return dividend/divisor;
 }
 public static void main(String[]args)
 {
 
 System.out.println("Power(2,3)="+calculatePower(2,3));
 System.out.println("Factorial(5)="+factorial(5));
 System.out.println("SafeDivide(10,5)="+safeDivide(10,5));
 // System.out.println(calculatePower(0,-2));
 // System.out.println(calculatePower(-3,-2));
 // System.out.println(calculatePower(0,0));
 // System.out.println(factorial(-5));
 // System.out.println(factorial(25));
 // System.out.println(safeDivide(5,0));
 // System.out.println(safeDivide(0,0));
 }
}