
public class CalculateFare implements CarOption{
	int fare=0;
	int totalFare=0;
	int remainingDistance=0;
	@Override
	public int miniCar(int distance) {
		int milstoneDistance=75;
		int baseDistance=3;
		if(distance>75) {
			totalFare=distance*8;
			return totalFare;
		}
		else {
			remainingDistance=distance-baseDistance;
			fare+=remainingDistance*10;
			totalFare+=fare+50;
			return totalFare;
			
		}
	}

	@Override
	public int sedanCar(int distance) {
		int milstoneDistance1=100;
		int baseDistance1=5;
		
		if(distance>75) {
			totalFare=distance*10;
			return totalFare;
		}
		else {
			remainingDistance=distance-baseDistance1;
			fare+=remainingDistance*12;
			totalFare+=fare+80;
			return totalFare;
		}
		
	}

	@Override
	public int suvCar(int distance) {
		int baseDistance2=5;
		
		remainingDistance=distance-baseDistance2;
		fare+=remainingDistance*15;
		totalFare+=fare+100;
		return totalFare;
	}

}
