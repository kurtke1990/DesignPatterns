package example.singleton;

/**
 * 
 * Bill Pugh Singleton Implementation
 * 
 * 在 Java 1.5 有些情況下，會導致 ThreadSafeSingleton 會失敗，因此使用 Bill Pugh Singleton
 * Implementation 來解決該問題，因為此方式不需要 synchronized，因此也較多使用此方式來建立 singleton
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
