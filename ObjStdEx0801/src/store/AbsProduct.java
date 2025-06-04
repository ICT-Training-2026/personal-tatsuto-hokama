package store;

/**
 * 抽象商品クラス
 * @author M.Takahashi
 */
public abstract class AbsProduct {
	/******** フィールド ******************************************/
	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private int price;

	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名初期値
	 * @param price 価格初期値
	 */
	protected AbsProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/******** メソッド ********************************************/
	/*--------------------抽象メソッド--------------------*/
	/**
	 * 商品情報表示
	 */
	public abstract void display();

	/*--------------------通常メソッド--------------------*/
	/**
	 * 商品名・価格情報取得（規定フォーマット）
	 */
	protected String getNameAndPrice() {
		return name + "：" + price + "円";
	}
}
