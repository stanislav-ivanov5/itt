package lesson24_collections_tasks;

public class Demo {

	public static void main(String... args) throws CompanyException {
		ICompany company = new Company("Shell");
		company.addEmployee(new Employee("Gosho", 25, 2000), "Pochistvane");
		company.addEmployee(new Employee("Pesho", 50, 800), "svinevydstvo");
		company.addEmployee(new Employee("Petranka", 20, 2500), "svinevydstvo");
		company.addEmployee(new Employee("Trendafila", 18, 3000), "HR");
		
//		company.listAllEmployees();
		
		for (Employee e : company.getAllEmployees("name")) {
			System.out.println(e);
		}
		
		
		
	}

}
