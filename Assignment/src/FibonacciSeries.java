import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0,n2=1,n3=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count");
		int count=sc.nextInt();
		System.out.println(n1+" "+n2);
		for(i=2;i<=count;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
