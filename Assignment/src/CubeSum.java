import java.util.Scanner;

public class CubeSum {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a =sc.nextInt();
		int sum=0;
		int n;
		while (a != 0){
			n=a%10;
			sum=sum+n*n*n;
			a=a/10;
		}
		System.out.println("the sum is "+sum);	
				
	}

}
