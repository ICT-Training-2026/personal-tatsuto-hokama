package driver;

import store.SpecialProduct;

/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// インスタンス化＋初期化
		SpecialProduct keyboard = new SpecialProduct("特価キーボード", 3600, 4500);

		// 情報表示
		System.out.println();
		keyboard.display();						// スーパークラスのメンバ
		keyboard.displayOrgPrice();				// サブクラスのメンバ
	}
}
