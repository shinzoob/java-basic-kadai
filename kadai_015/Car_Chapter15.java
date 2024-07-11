package kadai_015;

public class Car_Chapter15 {

	private int gear = 0;
	private int speed = 0;
	
	public Car_Chapter15() {
		this.gear = 1;
		this.speed = gear * 10;
	}
	
	public void gearChange(int alterGear) {
		System.out.println("ギア" + gear + "から" + alterGear + "に切り替えました");
		gear = alterGear;
		switch(gear) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			speed = gear * 10;
			break;
		default:
			speed = 10;
			break;
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");	
	}
}
