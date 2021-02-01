package creational.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder().setCpu("2.4GHz").setHdd("500 GB").setRam("256 GB")
				.setBluetoothEnabled(true).build();
		System.out.println(computer);
	}
}
