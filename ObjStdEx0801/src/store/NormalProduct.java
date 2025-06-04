package store;

/**
 * 商品クラス
 * @author M.Takahashi
 */
public class NormalProduct extends AbsProduct implements Deliverable {
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
	 * 情報表示
	 */
	@Override
	public void display() {
		System.out.println(getNameAndPrice());
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【通常送料500円】" + getNameAndPrice());
	}

}
