package lesson16_zad02_homework;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	public Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	public Student(String name, double grade, String subject,  
			int yearInCollege, int age, boolean isDegree, double money){
		this();
		if(name != null){
			this.name = name;
		}
		else {
			this.name = "";
		}
		if(subject != null){
			this.subject = subject;
		}
		else {
			this.subject = "";
		}
		if(age > 18){
			this.age = age;
		}
	}
		
	void upYear(){
		if(!isDegree){
			this.age++;
			if(this.age == 4){
				isDegree = true;
			}
		}
		else {
			System.out.println("The student has graduated");
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(min > 0){
			if(this.age < 30 && this.grade >= min){
				this.money += amount;
			}
			
		}
		return money;
	}
		
}
