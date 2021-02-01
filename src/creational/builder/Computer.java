package creational.builder;

public class Computer {
	private String cpu;
	private String ram;
	private String hdd;
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public static class ComputerBuilder {
		private String cpu;
		private String ram;
		private String hdd;
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}

		public ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

}
