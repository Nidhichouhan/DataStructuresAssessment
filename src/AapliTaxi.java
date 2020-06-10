import java.util.Scanner;

public class AapliTaxi {

	public static void main(String[] args) {
		CalculateFare calFare=new CalculateFare();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance you want to travel: ");
		int distance=sc.nextInt();
		System.out.println("Enter the type of car you want to travel with: ");
		int car=sc.nextInt();
		switch(car) 
		{
			case 1 :
				System.out.println("The Total Fare for Mini Car is: ");
				int amount=calFare.miniCar(distance);
				System.out.println(amount);
				break;
			case 2 :
				System.out.println("The Total Fare for Sedan Car is: ");
				int amount2=calFare.sedanCar(distance);
				System.out.println(amount2);
				break;
			case 3 :
				System.out.println("The Total Fare for SUV Car is: ");
				int amount3=calFare.suvCar(distance);
				System.out.println(amount3);
				break;
			default:
			System.out.println("This car is not available");
		}
		
	}

}
