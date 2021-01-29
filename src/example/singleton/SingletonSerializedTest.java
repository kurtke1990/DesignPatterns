package example.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instance1 = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("serializedsingleton.ser"));
		out.writeObject(instance1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("serializedsingleton.ser"));
		SerializedSingleton instance2 = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instance1 hashCode=" + instance1.hashCode());
		System.out.println("instance2 hashCode=" + instance2.hashCode());
	}
}
