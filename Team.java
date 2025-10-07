import java.util.Scanner;
class Team{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the points: ");
int points=sc.nextInt();
System.out.print("Enter the fouls: ");
short fouls=sc.nextShort();
boolean winStatus=(points>=50) && (fouls<=5);
System.out.println("Team Game Status: ");
System.out.println("Points: "+points);
System.out.println("Fouls: "+fouls);
System.out.println("Win Status: "+winStatus);
}
}