package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		// 加藤太郎のインスタンスを作成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName();
		taro.execIntroduce();
		
		System.out.println();

		// 加藤一郎のインスタンスを作成
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName();
		ichiro.execIntroduce();

		System.out.println();

		// 加藤花子のインスタンスを作成
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName();
		hanako.execIntroduce();
	}
}