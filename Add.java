import java.util.Scanner;
class Add{
      public static void main(String[]args){
        int a,b,add;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        add=a+b;
        System.out.println("The value of a is"+a);
        System.out.println("The value of b is"+b);
        System.out.printf("a=%d b=%d add=%d",a,b,add);
        System.out.println("a+b="+add);
}
}

        
                                