package lesson24_collections_tasks;

import java.util.SortedSet;

public interface ICompany {

	void addEmployee(Employee e, String department);

	void listAllEmployees();
	
	SortedSet<Employee> getAllEmployees(String sortByWhat);

}