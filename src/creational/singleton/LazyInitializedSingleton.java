package creational.singleton;

/**
 * 
 * Lazy Initialization
 * 
 * 缺點
 * 
 * 1. 在 multi-thread 時，instance 可能還是會被重複建立
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
