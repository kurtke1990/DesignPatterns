package creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

	@Override
	public Computer createComputer(ComputerSpec spec) {
		return new Server(spec);
	}

}
