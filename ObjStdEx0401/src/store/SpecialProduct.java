package store;

/**
 * 特価商品クラス
 * @author M.Takahashi
 */
public class SpecialProduct extends Product {
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

	/**
	 * @param name 商品名
	 */
	public SpecialProduct(String name) {
		this(name, 0, 0);
	}

	/******** メソッド ******************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * フィールドに値を設定
	 * @return orgPrice
	 */
	public int getOrgPrice() {
		return orgPrice;
	}

	/**
	 * フィールドの値を取得
	 * @param orgPrice セットする orgPrice
	 */
	public void setOrgPrice(int orgPrice) {
		this.orgPrice = orgPrice;
	}

	/*--------------------通常メソッド--------------------*/
	/**
	 * 定価表示
	 */
	public void displayOrgPrice() {
		System.out.println("定価：" + orgPrice + "円");
	}

}
