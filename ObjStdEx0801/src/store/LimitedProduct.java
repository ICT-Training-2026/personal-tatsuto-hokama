package store;

/**
 * 期間限定商品クラス
 * @author M.Takahashi
 */
public class LimitedProduct extends AbsProduct {

	/******** フィールド ******************************************/
	/**
	 * 残り日数
	 */
	private int dayCnt;

	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名
	 * @param price 価格
	 * @param dayCnt 残り日数
	 */
	public LimitedProduct(String name, int price, int dayCnt) {
		super(name, price);
		this.dayCnt = dayCnt;
	}

	/******** メソッド ******************************************/
	/*--------------------通常メソッド--------------------*/
	/**
	 * 引数で受け取った値を 残り日数から引く
	 * @param minus 残り日数から引く値
	 * @return 計算後の残り日数
	 */
	public int minusDayCnt(int minus) {
		return (dayCnt -= minus);
	}

	/**
	 * 情報表示（オーバーライド）
	 */
	@Override
	public void display() {
		if (0 < dayCnt) {
			System.out.println(getNameAndPrice() + "(配送不可)(残り：" + dayCnt + "日)");
		}
	}
}
