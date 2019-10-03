package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		EmployeeService service = new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("Enter your choice:");
			System.out.println("1.Add Employee");
			System.out.println("2.Remove Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.Update Employee");
			System.out.println("5.Show All Employee");
			System.out.println("6.Show All Employee Between Salary");
			System.out.println("7.Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < 2; i++) {
					System.out.println("Enter Id");
					int id = scanner.nextInt();
					System.out.println("Enter Name");
					String name = scanner.next();
					System.out.println("Enter Salary");
					double sal = scanner.nextDouble();
					System.out.println("Enter the Date of Joining");
					String date = scanner.next();
					SimpleDateFormat st = new SimpleDateFormat("yyyy/MM/dd");
					Date date2 = st.parse(date);
					System.out.println("Enter city");
					String city = scanner.next();
					System.out.println("Enter state");
					String state = scanner.next();
					System.out.println("Enter pincode");
					Integer pincode = scanner.nextInt();
					System.out.println("Enter project Id");
					Integer proj_id = scanner.nextInt();
					System.out.println("Enter project name");
					String proj_name = scanner.next();
					System.out.println("Enter project cost");
					Double proj_cost = scanner.nextDouble();
					System.out.println("Enter Department Id");
					int deptId = scanner.nextInt();
					System.out.println("Enter Department Name");
					String deptName = scanner.next();

					Employee emp = new Employee();
					Address addr = new Address();
					Project project = new Project();
					Department dept = new Department();
					emp.setEmpId(id);
					emp.setEmpName(name);
					emp.setEmpSalary(sal);
					emp.setDateOfJoining(date2);

					addr.setCity(city);
					addr.setState(state);
					addr.setPincode(pincode);

					project.setProjectId(proj_id);
					project.setProjectName(proj_name);
					project.setProjectCost(proj_cost);

					dept.setDeptId(deptId);
					dept.setDeptName(deptName);

					emp.setAddr(addr);
					emp.setProject(project);
					emp.setDept(dept);

				service.addEmployee(emp);
				}
				break;
			case 2:
				System.out.println("Enter the Employee Id to be removed");
				int remove_id = scanner.nextInt();
				service.removeEmployee(remove_id);
				break;
			case 3:
				System.out.println("Enter the Employee Id to be searched");
				int searchId = scanner.nextInt();
				Employee searchEmp = service.searchEmployee(searchId);
				System.out.println(searchEmp.toString());
				break;
			case 4:
				break;
			case 5:
				List<Employee> empList = service.showAll();
				for (Employee employee : empList) {
					System.out.println(employee.toString());
				}
				break;
			case 6:
				System.out.println("Enter the min salary");
				double min = scanner.nextDouble();
				System.out.println("Enter the max salary");
				double max = scanner.nextDouble();
				List<Employee> empListSalary = service.showBetweenSalary(min, max);
				for (Employee employee : empListSalary) {
					System.out.println(employee.toString());
				}
				break;
			case 7:
				System.exit(0);
			}
		} while (choice != 7);
		scanner.close();
	}

}
