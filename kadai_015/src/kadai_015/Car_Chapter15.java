package kadai_015;

public class Car_Chapter15 {
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	public Car_Chapter15(int gear, int speed) {
		
	}



	public void changeGear (final int afterGear) {
		//ギアの値により速度を変える
		switch(afterGear) {
		case 1:
			this.speed=10;
			break;
	
		case 2:
			this.speed=20;
			break;
	
		case 3:
			this.speed=30;
			break;
	
		case 4:
			this.speed=40;
			break;
	
		case 5:
			this.speed=50;
   	 		break;
	
		default:
			this.speed=10;
		}
		
		System.out.println("ギア"+this.gear+"から"+afterGear+"に切り替えました");
		this.gear = afterGear;
	}

	public void run () {
		//ギアチェンジ後の速度を表示する
		System.out.println("速度は時速"+this.speed+"kmです");

	}
}
