package creational.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		ComputerSpec pcSpec = new ComputerSpec("2.4 GHz", "16 GB", "256 GB");
		ComputerSpec serverSpec = new ComputerSpec("3.4 GHz", "32 GB", "1 TB");
		Computer pc = ComputerFactory.getComputer(new PCFactory(), pcSpec);
		Computer server = ComputerFactory.getComputer(new ServerFactory(), serverSpec);

		pc.showInfo();
		server.showInfo();
	}
}
