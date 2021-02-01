package creational.factory;

public class ComputerFactory {
	public static Computer createComputer(String computerType, String cpu, String ram, String hdd) {
		if (computerType.equalsIgnoreCase("pc")) {
			return new PC(cpu, ram, hdd);
		}

		if (computerType.equalsIgnoreCase("server")) {
			return new Server(cpu, ram, hdd);
		}

		return null;
	}
}
