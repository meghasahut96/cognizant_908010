import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int num=0;
		String PrimeNumber="";
		System.out.print("enter number");
		int n=sc.nextInt();
		for (i=0;i<=n;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if (i%num==0){
					counter=counter+1;
				}
			}
			if (counter==2){
				PrimeNumber=PrimeNumber + i +" ";
			}
		}
		System.out.println(PrimeNumber);
	}
}
