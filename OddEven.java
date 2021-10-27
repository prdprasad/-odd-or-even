import java.util.*;
public class OddEven{
	static void check(){
		System.out.print("Enter a Number: "); 
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println(num+" is Even Number ");
		}
		else{
			System.out.println(num+" is Odd Number ");
		}
	}
	public static void main(String args[]){
		check();
	}
}