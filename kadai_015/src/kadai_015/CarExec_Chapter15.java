package kadai_015;


public class CarExec_Chapter15 {
		public static void main (String[] args) {
			//車のデータを生成(インスタンスは１つだけ)
			//Car_Chapter15 gear1 = new Car_Chapter15 (1,10,	"ギア1");
			//Car_Chapter15 gear2 = new Car_Chapter15 (2,20,	"ギア2");
			//Car_Chapter15 gear3 = new Car_Chapter15 (3,30,	"ギア3");
			//Car_Chapter15 gear4 = new Car_Chapter15 (4,40,	"ギア4");
			//Car_Chapter15 gear5 = new Car_Chapter15 (5,50,	"ギア5");
			//Car_Chapter15 other = new Car_Chapter15 (1,10,	"上記以外のギア");
			
			Car_Chapter15 Car = new Car_Chapter15 (1,10);
			//ぎあをちぇんじ
			
			Car.changeGear(3);
			
			Car.run();
		
			Car.changeGear(4);
			
			Car.run();
	}
}