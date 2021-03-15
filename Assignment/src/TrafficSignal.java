import java.util.Scanner;

public class TrafficSignal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any colour:red,yellow,green");
		String colour=sc.nextLine();
		switch(colour) {
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:System.out.println("Not a colour");
		}
//		if (colour=="red") {
//			System.out.println("STOP");
//		}
//		else if(colour=="yellow") {
//			System.out.println("READY");
//		}
//		else if(colour=="green") {
//			System.out.println("GO");
//		}
//		else {
//			System.out.println("Wrong Input");
//		}
	}
		
		

}
