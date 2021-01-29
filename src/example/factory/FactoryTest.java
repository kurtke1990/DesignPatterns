package example.factory;

public class FactoryTest {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2.4 GHz", "16 GB", "256 GB");
		Computer server = ComputerFactory.getComputer("server", "3.4 GHz", "32 GB", "1 TB");
		pc.showInfo();
		server.showInfo();
	}
}
