package store;

/**
 * 特価商品クラス
 * @author M.Takahashi
 */
public class SpecialProduct extends AbsProduct {
	/******** フィールド ******************************************/
	/**
	 * 定価
	 */
	private int orgPrice;

	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名
	 * @param price 価格
	 * @param orgPrice 定価
	 */
	public SpecialProduct(String name, int price, int orgPrice) {
		super(name, price);
		this.orgPrice = orgPrice;
	}

	/******** メソッド ******************************************/
	/*--------------------通常メソッド--------------------*/
	/**
	 * 情報表示（オーバーライド）
	 */
	@Override
	public void display() {
		System.out.println(getNameAndPrice() + "(定価：" + orgPrice + "円)");
	}
}
