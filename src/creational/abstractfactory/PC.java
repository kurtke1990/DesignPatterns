package creational.abstractfactory;

public class PC extends Computer {
	private ComputerSpec spec;

	public PC(ComputerSpec spec) {
		this.spec = spec;
	}

	@Override
	public void showInfo() {
		System.out.println(
				String.format("PC info >> CPU: %s, RAM: %s, HDD: %s", spec.getCpu(), spec.getRam(), spec.getHdd()));
	}

}
