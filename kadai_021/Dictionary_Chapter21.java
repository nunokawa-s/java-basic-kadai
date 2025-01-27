package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//フィールド
	public HashMap<String, String> dictionary;

	//辞書の作成
	public Dictionary_Chapter21() {
		dictionary = new HashMap<String, String>();

		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

	}

	// 単語(keyWord)を辞書から検索するメソッド
	public void searchWord(String keyWord) {
		if (dictionary.containsKey(keyWord)) {
			System.out.println(keyWord + "の意味は" + dictionary.get(keyWord));
		} else {
			System.out.println(keyWord + " は辞書に存在しません。");
		}
	}
}
