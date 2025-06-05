package store;

/**
 * 通常商品クラス
 * @author M.Takahashi
 */
public class NormalProduct extends AbsProduct {
	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名初期値
	 * @param price 価格初期値
	 */
	public NormalProduct(String name, int price) {
		super(name, price);
	}

	/******** メソッド ******************************************/
	/**
	 * 情報表示（オーバーライド）
	 */
	@Override
	public void display() {
		System.out.println(getNameAndPrice());
	}
}
