package lesson24_collections_tasks;

public class Employee {

	private static int currentId = 1;

	private String name;
	private int age;
	private int salary;
	private int id;

	public Employee(String name, int age, int salary) throws CompanyException {
		setName(name);
		setAge(age);
		setSalary(salary);
		this.id = currentId++;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) throws CompanyException {
		if (name != null && name.length() > 0)
			this.name = name;
		else
			throw new CompanyException("Invalid Name");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		return ((Employee) obj).id == this.id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) throws CompanyException {
		if (age > 0 && this.age < age)
			this.age = age;
		else
			throw new CompanyException("Invalid Age");
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) throws CompanyException {
		if (salary > 0)
			this.salary = salary;
		else
			throw new CompanyException("Invalid salary.");
	}

}
