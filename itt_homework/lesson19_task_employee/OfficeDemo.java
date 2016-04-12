package lesson19_task_employee;

public class OfficeDemo {

	public static void main(String[] args) {
		
		Employee peter = new Employee("emp: Peter");
		Employee sveti = new Employee("emp: Sveti");
		Employee vesel = new Employee("emp: Vesel");
		
		Task homework = new Task("task: doing homework", 5);
		Task classwork = new Task("task: doing classwork", 4);
		Task calculating = new Task("task: calculating factors of 10", 8);
		Task actualWork = new Task("task: working, sometime you just have to work", 12);
		Task drawing = new Task("task: drawing portrets", 3);
		Task setEmailAddress = new Task("task: setting up an email ", 1);
		Task setEclipse = new Task("task: setting up Eclipse", 1);
		Task meeting = new Task("task: meeting clients", 5);
		Task goToOtherOffice = new Task("task: meet with colleagues", 2);
		Task youtube = new Task("task: watching an extremely work related stuff on youtube", 1);
		
		Task newTask = new Task("testing", 2);

		AllWork allWork = new AllWork();
		allWork.addTask(homework);
		allWork.addTask(classwork);
		allWork.addTask(calculating);
		allWork.addTask(actualWork);
		allWork.addTask(drawing);
		allWork.addTask(setEmailAddress);
		allWork.addTask(setEclipse);
		allWork.addTask(meeting);
		allWork.addTask(goToOtherOffice);
		allWork.addTask(youtube);
	
		// these won't be added
		allWork.addTask(newTask);
		allWork.addTask(newTask);
		
		allWork.addWorker(peter);
		allWork.addWorker(sveti);
//		allWork.addWorker(vesel);

		
		System.out.println("**********");
		
		int dayCount = 1;
		
		while(dayCount <= 5){

			System.out.println("--start day: " + dayCount);
			
			for(Employee em : allWork.getWorkers()){
				if(em != null){
					em.startWorkDay();
				}
			}
			
			for(Employee em : allWork.getWorkers()){
				if(em != null){
					em.work();
				}
			}
			
			System.out.println("--end day: " + dayCount);
			dayCount++;
		}
		

		if(allWork.isAllWorkDone()){   // check if all work is done
			System.out.println("all work DONE ");
		} 
		else {
			System.out.println("all work NOT DONE");
		}
	}
}
