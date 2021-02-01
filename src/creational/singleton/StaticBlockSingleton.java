package creational.singleton;

/**
 * 
 * Static block initialization
 * 
 * 缺點:
 * 
 * 1. 只解決了 Eager initialization 的 exception handling 問題，未解決未使用到此 singleton
 * 就先被建立的問題
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("建立 singleton 物件時發生錯誤");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
