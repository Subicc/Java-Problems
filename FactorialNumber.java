package pack1;
import java.util.Scanner;
public class FactorialNumber {
	
public static void main(String args[]){
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number:");
	 
	 int num = scanner.nextInt();
	 
	 long factorial = fact(num);
	 System.out.println("Factorial of entered number is: "+factorial);
	 }
	static long fact(long n)
	 {
	 long output;
	 if(n==1){
	 return 1;
	 }
	 //Recursion: Function calling itself!!
	 output = fact(n-1)* n;
	 return output;
	 }
}
	 


