package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements Cloneable {
	private List<String> employees;

	public EmployeeService() {
		employees = new ArrayList<String>();
	}

	public EmployeeService(List<String> employees) {
		this.employees = employees;
	}

	public void loadData() {
		employees.add("Pankaj");
		employees.add("Raj");
		employees.add("David");
		employees.add("Lisa");
	}

	public List<String> getEmployees() {
		return employees;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> newEmployees = new ArrayList<String>();
		for (String employee : this.getEmployees()) {
			newEmployees.add(employee);
		}
		return new EmployeeService(newEmployees);
	}

}
