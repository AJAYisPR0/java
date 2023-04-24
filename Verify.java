import java.util.Scanner;
class Verify{

public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("AGE VERIFICATION");
System.out.println("Enter Your Name:");
String name= sc.next();
System.out.println("Enter Your Age:");
int age= sc.nextInt();

if( age>=18){
    System.out.println("You're Eligible For Voting!");
}
else{
    System.out.println("You're not eligible for voting.");
}
}
}