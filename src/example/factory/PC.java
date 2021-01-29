package example.factory;

public class PC extends Computer {
	private String cpu;
	private String ram;
	private String hdd;

	public PC(String cpu, String ram, String hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public void showInfo() {
		System.out.println(String.format("PC info >> CPU: %s, RAM: %s, HDD: %s", cpu, ram, hdd));
	}

}
