package creational.singleton;

/**
 * 
 * Eager initialization
 * 
 * 缺點:
 * 
 * 1. 未使用到此 singleton 就先被建立，而非執行 getInstance 時才去建立
 * 
 * 2. 沒有做 exception handling
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class EagerInitializedSingleton {
	public static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
