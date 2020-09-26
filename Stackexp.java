import java.util.*;
public class Stackexp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int number=sc.nextInt();
		
		
		Stack nums=new Stack();
		nums.push(number);	
		
		nums.show();

	}
}
