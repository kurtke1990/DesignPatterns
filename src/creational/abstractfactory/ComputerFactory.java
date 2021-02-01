package creational.abstractfactory;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory, ComputerSpec computerSpec) {
		return factory.createComputer(computerSpec);
	}
}
