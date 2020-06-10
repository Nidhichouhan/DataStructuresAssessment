package WithoutOops;

import java.util.Scanner;

public class AapliTaxi{
	public static void main(String [] args) {
		int fare=0;
		int totalFare=0;
		int remainingDistance=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance you want to travel: ");
		int distance=sc.nextInt();
		System.out.println("Enter the type of car you want to travel with: ");
		int car=sc.nextInt();
		switch(car) 
		{
		
			case 1 :
				int milstoneDistance=75;
				int baseDistance=3;
				System.out.println("Cost for calculating fare of Mini Car:");
				if(distance>75) {
					totalFare=distance*8;
					System.out.println(totalFare);
				}
				else {
					remainingDistance=distance-baseDistance;
					fare+=remainingDistance*10;
					totalFare+=fare+50;
					System.out.println(totalFare);
				}
				
				
				break;
			case 2 :
				int milstoneDistance1=100;
				int baseDistance1=5;
				System.out.println("Cost for calculating fare of Sedan Car:");
				if(distance>75) {
					totalFare=distance*10;
					System.out.println(totalFare);
				}
				else {
					remainingDistance=distance-baseDistance1;
					fare+=remainingDistance*12;
					totalFare+=fare+80;
					System.out.println(totalFare);
				}
				break;
			case 3 :
				
				int baseDistance2=5;
				System.out.println("Cost for calculating fare of SUV Car:");
				remainingDistance=distance-baseDistance2;
				fare+=remainingDistance*15;
				totalFare+=fare+100;
				System.out.println(totalFare);
				break;
			default:
			System.out.println("This car is not available");
		}
	}
}
