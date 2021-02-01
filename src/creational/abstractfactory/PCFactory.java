package creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

	@Override
	public Computer createComputer(ComputerSpec spec) {
		return new PC(spec);
	}

}
