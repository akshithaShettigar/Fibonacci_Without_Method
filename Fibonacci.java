//Fibonacci without methods and finds the values upto N
import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		int result;
		int fib1=0;
		int fib2=1;
		System.out.print("The result is :");
		for(int i=0;i<=n;i++){
			result =fib1+fib2;
			fib1=fib2;
			fib2=result;
			System.out.print( "\t"+result);
		}
		
	}
}

//Enter the Number:6
//The result is : 1       2       3       5       8       13      21