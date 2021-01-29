package example.singleton;

import java.io.Serializable;

/**
 * 
 * 透過實作 readResolve，確保此 singleton 在序列化與反序列化時，會是相同的物件
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = 770089145042823884L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
