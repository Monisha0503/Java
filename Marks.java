import java.util.Scanner;
class Marks
{
        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter marks for subject 1: ");
        float mark1=sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        float mark2=sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        float mark3=sc.nextInt();
          float total=mark1+mark2+mark3;
        float average=total/3;
        char grade;
        if(mark1<50 || mark2<50 || mark3<50)
        grade='U';
        else if(average>=90)
        grade='S';
         else if(average>=80)
        grade='A';
        else if(average>=70)
        grade='B';
        else if(average>=60)
        grade='C';
        else if(average>=50)
        grade='D';
        else
        grade='U';
        Boolean passStatus=(mark1>=50) || (mark2>=50) || (mark3>=50);
        System.out.println("Total: "+total);
        System.out.println("Average: "+average);
        System.out.println("Grade: "+grade);
        System.out.println("Pass Status: "+passStatus);
}
}