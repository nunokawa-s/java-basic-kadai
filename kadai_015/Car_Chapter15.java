package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 1; //ギア
	private int speed = 10; //速度

	//ギアの値により速度を変える メソッド
	public void gearChange(int afrerGear) {
		System.out.println("ギア" + this.gear + "から" + afrerGear + "に切り替えました");
		this.gear = afrerGear;

		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}

	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
