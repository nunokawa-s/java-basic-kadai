package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		// 親クラスのインスタンスを作成
		Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();

		// 単語を検索
		myDictionary.searchWord("apple");
		myDictionary.searchWord("banana");
		myDictionary.searchWord("grape");
		myDictionary.searchWord("orange");
	}
}
