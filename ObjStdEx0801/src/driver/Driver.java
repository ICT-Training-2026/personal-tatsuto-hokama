package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
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
		// 配列の作成（抽象クラス）
		AbsProduct[] prod = makeProductList();
		
		// 商品情報一覧の表示
		System.out.println("\n--- 商品リスト ---");
		displayProductList(prod);

		// 配送対象の抽出
		Deliverable[] deliv = getDeliverable(prod);
		
		// 配送情報一覧の表示
		System.out.println("\n--- 配送可能商品 ---");
		displayDelivList(deliv);
	}

	/**
	 * 配列の作成（抽象クラス AbsProduct型）
	 * @return 作成した配列
	 */
	static AbsProduct[] makeProductList() {
		// 配列宣言・要素の初期化
		AbsProduct[] prod = {
				new LimitedProduct("マウス", 2000, 10),
				new SpecialProduct("特価キーボード", 3600, 4500),
				new LimitedProduct("Webカメラ", 3900, 7),
				new NormalProduct("マイク",2800),
				new SpecialProduct("ディスプレイ", 15000, 20000),
				new NormalProduct("LED照明", 4200)
		};

		return prod;
	}
	
	/**
	 * 商品情報一覧の表示
	 * @param absProd 表示する配列
	 */
	static void displayProductList(AbsProduct[] absProd) {
		for (int i = 0; i < absProd.length; i++) {
			System.out.println();
			absProd[i].display();
		}
	}
	
	/**
	 * 配送対象の抽出
	 * @param prod 商品配列
	 * @return 配送対象商品の配列（要素が Null 以降は対象外）
	 */
	static Deliverable[] getDeliverable(AbsProduct[] prod) {
		Deliverable[] deliv = new Deliverable[prod.length];
		int dCnt = 0;
		for (int i = 0; i < prod.length; i++) {
			if (prod[i] instanceof Deliverable) {
				deliv[dCnt] = (Deliverable) prod[i];
				dCnt++;
			}
		}
		
		return deliv;
	}
	
	/**
	 * 配送情報一覧の表示
	 * @param deliv 配送可能商品リスト
	 */
	static void displayDelivList(Deliverable[] deliv) {
		for (int i = 0; i < deliv.length; i++) {
			if (deliv[i] == null) {
				break;
			}
			System.out.println();
			deliv[i].displayDeliv();
		}
	}
	
}
