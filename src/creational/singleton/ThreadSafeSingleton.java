package creational.singleton;

/**
 * 
 * Thread Safe Singleton
 * 
 * getInstance1 缺點:
 * 
 * 1. 會導致 performance 降低，因為每次做 getInstance1 時，都會先 lock，產生沒必要的開銷，因此透過
 * getInstance2 的改寫，只要在 instance 為 null 時，才要去做 synchronized
 *
 * 
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance1() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public static ThreadSafeSingleton getInstance2() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
