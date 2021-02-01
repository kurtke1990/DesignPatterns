package creational.prototype;

import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.loadData();

		try {
			EmployeeService newEmployeeService1 = (EmployeeService) employeeService.clone();
			EmployeeService newEmployeeService2 = (EmployeeService) employeeService.clone();

			List<String> newEmployeeService1Employees = newEmployeeService1.getEmployees();
			newEmployeeService1Employees.add("John");

			List<String> newEmployeeService2Employees = newEmployeeService2.getEmployees();
			newEmployeeService2Employees.remove("Pankaj");

			System.out.println("original employees: " + employeeService.getEmployees());
			System.out.println("newEmployeeService1 employees: " + newEmployeeService1Employees);
			System.out.println("newEmployeeService2 employees: " + newEmployeeService2Employees);
			System.out.println("original employees: " + employeeService.getEmployees());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
