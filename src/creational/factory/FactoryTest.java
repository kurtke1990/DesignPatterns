package creational.factory;

public class FactoryTest {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.createComputer("pc", "2.4 GHz", "16 GB", "256 GB");
		Computer server = ComputerFactory.createComputer("server", "3.4 GHz", "32 GB", "1 TB");
		pc.showInfo();
		server.showInfo();
	}
}
