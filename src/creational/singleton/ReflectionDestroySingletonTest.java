package creational.singleton;

import java.lang.reflect.Constructor;

/**
 * 
 * 透過 reflection 的方式，破壞 singleton
 *
 * @author kurtke
 * 
 *         2021-01-29
 */
public class ReflectionDestroySingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = null;

		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {

				// 讓 constructor 可以 access
				constructor.setAccessible(true);

				// 重新產生一個 EagerInitializedSingleton 物件
				instance2 = (EagerInitializedSingleton) constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
