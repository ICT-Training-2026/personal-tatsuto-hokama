package driver;

import store.Product;
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
		// 配列宣言・要素の初期化
		Product[] prod = {
				new Product("マウス", 2000),
				new SpecialProduct("特化キーボード", 3600, 4500)	// アップキャスト
		};
		
		// 情報表示
		for (int i = 0; i < prod.length; i++) {
			System.out.println();
			prod[i].display();							// ダイナミックバインディング
		}
	}
}
