package assignment_package;

import java.util.*;

public class FooCorporation {

	private double[][] addEmployeeDetailsToList() {
		double[][] employeesList = new double[3][2];

		employeesList[0][0] = 7.50;
		employeesList[0][1] = 35.0;

		employeesList[1][0] = 8.20;
		employeesList[1][1] = 47.0;

		employeesList[2][0] = 10.0;
		employeesList[2][1] = 73.0;

		return employeesList;
	}

	private double computeSalary(double hoursWorked, double basePay) {
		if (basePay < 8.00 || hoursWorked > 60.0) {
			return basePay < 8.00 ? -1.0 : -2.0;
		}
		if (hoursWorked > 40.0)
			return basePay * 1.5 * hoursWorked;

		return hoursWorked * basePay;
	}

	// Main method
	public static void main(String[] args) {
		FooCorporation fooCorporation = new FooCorporation();

		double[][] employeesList = fooCorporation.addEmployeeDetailsToList();

		List<Employee> employeeDetails = new ArrayList<Employee>();

		for (double employeeList[] : employeesList) {
			Employee employee = new Employee();
			employee.setBasePay(employeeList[0]);
			employee.setWorkedHours(employeeList[1]);

			employeeDetails.add(employee);
		}

		for (Employee employee : employeeDetails) {
			double hoursWorked = employee.getWorkedHours();
			double basePay = employee.getBasePay();
			double computedSalary = fooCorporation.computeSalary(hoursWorked, basePay);

			if (computedSalary == -1.0) {
				System.out.println("Base pay Cannot Be Lesser Than 8.00 $");
			} else if (computedSalary == -2.0) {
				System.out.println("No Labour Should Work More Than 60 Hours");
			} else {
				System.out.println("Salary Of Employee " + " is " + computedSalary);
			}
		}
	}
}










package assignment_package;

public class FooCorporation {
	private double computeSalary(double hoursWorked,double basePay) {
		if(basePay < 8.00 || hoursWorked > 60.0) {
			return basePay < 8.00 ? -1.0 : -2.0;
		}
		if(hoursWorked > 40.0) return basePay * 1.5 * hoursWorked;
		
		
		return hoursWorked * basePay;
	}
	
	public static void main(String[] args) {
		FooCorporation fooCorporation = new FooCorporation();
		
		double[][] employeesDetails = new double[3][2];
		
		employeesDetails[0][0] = 7.50;
		employeesDetails[0][1] = 35.0;
		
		employeesDetails[1][0] = 8.20;
		employeesDetails[1][1] = 47.0;

		employeesDetails[2][0] = 10.0;
		employeesDetails[2][1] = 73.0;
		
		
		for(double employeeDetails[] : employeesDetails) {
			double hoursWorked = employeeDetails[1];
			double basePay = employeeDetails[0];
			double computedSalary = fooCorporation.computeSalary(hoursWorked,basePay);
			
			if(computedSalary == -1.0) {
				System.out.println("Base pay Cannot Be Lesser Than 8.00 $");
			}
			else if(computedSalary == -2.0) {
				System.out.println("No Labour Should Work More Than 60 Hours");
			}
			else {
				System.out.println("Salary Of Employee " + " is " +  computedSalary);
			}
		}
	}
}

