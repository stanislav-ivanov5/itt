package lesson24_collections_tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Company implements ICompany {

	// department name -> set of employees
	private Map<String, Set<Employee>> departments;
	private String name;

	public Company(String name) {
		this.name = name;
		this.departments = new HashMap<String, Set<Employee>>();
	}

	
	
	
	public SortedSet<Employee> getAllEmployees(String sortByWhat) {
		if (sortByWhat != null) {
			TreeSet<Employee> result2 = new TreeSet<Employee>();
			
			TreeSet<Employee> result = new TreeSet<Employee>((emp1, emp2) -> {
				switch (sortByWhat) {
				case "salary":
					return emp1.getSalary() - emp2.getSalary();
				case "name":
					return emp1.getName().compareTo(emp2.getName());
				default:
					return emp1.getAge() - emp2.getAge();
				}
			});

			for (String department : departments.keySet()) {
				Set<Employee> employeesInThisDepartment = departments.get(department);
				result.addAll(employeesInThisDepartment);
			}

			return result;
		}
		return null;
	}

	@Override
	public void addEmployee(Employee e, String department) {
		if (e != null && department != null && department.length() > 0) {

			if (!departments.containsKey(department)) {
				departments.put(department, new HashSet<Employee>());
			}

			departments.get(department).add(e);
		}
	}

	@Override
	public void listAllEmployees() {
		for (String department : departments.keySet()) {
			System.out.println("Department : " + department);
			Set<Employee> employeesInThisDepartment = departments.get(department);

			for (Employee e : employeesInThisDepartment) {
				System.out.println(e);
			}
		}
	}
}
