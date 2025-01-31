package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String choice = scanner.nextLine();

		// 無効な手が入力された場合、再度入力を促す
		while (!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
			choice = scanner.nextLine();
		}

		return choice;
	}

	// ランダムで選ぶ
	public String getRandom() {
		// 0: グー, 1: チョキ, 2: パー
		int cpuChoice = (int) Math.floor(Math.random() * 3);
		String[] hands = { "r", "s", "p" };
		return hands[cpuChoice];
	}

	// ゲームを実行するメソッド
	public void playGame() {

		// プレイヤーの手を取得
		String playerHand = getMyChoice();

		// コンピュータの手を取得
		String computerHand = getRandom();

		// 手の種類をHashMapで管理
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");

		// 勝敗結果をHashMapで管理
		HashMap<String, String> resultMap = new HashMap<>();
		resultMap.put("r-s", "勝ち");
		resultMap.put("s-p", "勝ち");
		resultMap.put("p-r", "勝ち");
		resultMap.put("s-r", "負け");
		resultMap.put("p-s", "負け");
		resultMap.put("r-p", "負け");
		resultMap.put("r-r", "引き分け");
		resultMap.put("s-s", "引き分け");
		resultMap.put("p-p", "引き分け");

		// プレイヤーとコンピュータの手を表示
		System.out.println("自分の手は " + handMap.get(playerHand) + ",コンピューターの手は " + handMap.get(computerHand));

		// 勝敗の判定
		String resultKey = playerHand + "-" + computerHand;
		String result = resultMap.get(resultKey);

		// 結果を表示
		if (result.equals("勝ち")) {
			System.out.println("自分の勝ちです");
		} else if (result.equals("負け")) {
			System.out.println("自分の負けです");
		} else {
			System.out.println("引き分けです");
		}
	}
}
