package kadai_018;

public abstract class Kato_Chapter18 {
    // フィールド
    public String familyName = "名前は加藤";
    public String givenName;
    public String address = "住所は東京都中野区〇×です";

    // 共通の紹介メソッド
    public void commonIntroduce() {
        System.out.println( familyName + givenName + "です");
        System.out.println(address);
    }

    // 各自の紹介メソッド
    abstract  public  void eachIntroduce();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}