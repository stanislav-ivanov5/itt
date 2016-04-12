package lesson19_task_employee;

import java.util.Arrays;

public class AllWork {

	private static final int MAX_CURR_TASK = 9;
	private static final int MIN_CURR_TASK = 0;
	private static final boolean FALSE_CONSTANT = false;
	private static final boolean TRUE_CONSTANT = true;
	private static final int MAX_WORKERS = 50;
	private static final int DEFAULT_CURR_TASK = 0;
	private static final int MAX_FREE_PLACES = 10;
	private static final int MIN_FREE_PLACES = 0;
	private static final int DEFAULT_FREE_PLACES = 10;

	private static int currUnassignedTask;
	private Task[] tasks;
	private Employee[] workers;
	private int freePlacesTasks;
	private int counter; // empty position of workers[] to add an employee 
	
	public AllWork(){
		tasks = new Task[MAX_FREE_PLACES];
		workers = new Employee[MAX_WORKERS];
		Employee.allwork = this;
		setFreePlacesTasks(MAX_FREE_PLACES);
		setCurrUnassignedTask(0);
		this.counter = 0;
	}
	
	void addTask(Task task){

		boolean hasEmptyCell = false;
		
		for(Task t : tasks){
			hasEmptyCell = false;
			if(t == null){
				hasEmptyCell = true;
				continue;
			}
		}
		
		if(task != null & hasEmptyCell){
			if(getFreePlacesTasks() >= MIN_FREE_PLACES){
				tasks[MAX_FREE_PLACES - getFreePlacesTasks()] = task;
				setFreePlacesTasks(getFreePlacesTasks() - 1); 					
			} 
		}
		
		if(!hasEmptyCell){
			System.out.println("can't hold more tasks ");
		}
	}
	
	void addWorker(Employee em){
		boolean isValidCounter = (counter >= MIN_CURR_TASK && counter < workers.length) 
				? TRUE_CONSTANT : FALSE_CONSTANT;
		
		if(em != null && isValidCounter ){
			this.workers[counter] = em;
			counter++;
		}
		
		emplSetTask();
	}

	void emplSetTask() {
		for(Employee empl : workers){
			if(empl != null && empl.getCurrTask() == null &&
					tasks[currUnassignedTask] != null ){
				
				empl.setCurrTask(getNextTask());
			}
		}
	}
	
	
	Task getNextTask(){

		if(tasks[currUnassignedTask] != null && currUnassignedTask < tasks.length - 1){
			return tasks[currUnassignedTask++];
		}
		return null;
	}
//			if(currUnassignedTask == 9){
//				return tasks[currUnassignedTask];
//				
//			}

	
	void deleteTask(){
		
		int currTask = (currUnassignedTask == MIN_CURR_TASK) ? MIN_CURR_TASK : currUnassignedTask - 1;
		
		if(currTask >= MIN_CURR_TASK & currTask < MAX_CURR_TASK) {
			tasks[currTask] = null;
			setFreePlacesTasks(getFreePlacesTasks() + 1);
		}
	}
	
	boolean isAllWorkDone(){
		
		boolean isAllWorkDone = false;
		
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i] != null){ // if there is one null array cell, the work is not done
				isAllWorkDone = false; // set isAllWorkDone = false on each for iteration
				break;
			}
			isAllWorkDone = true;
		}
		return isAllWorkDone;
	}
    
	// get and set methods
	public int getFreePlacesTasks() {
		return freePlacesTasks;
	}

	public void setFreePlacesTasks(int freePlacesTasks) {
		this.freePlacesTasks = 
				(freePlacesTasks >= MIN_FREE_PLACES && freePlacesTasks <= MAX_FREE_PLACES) ? 
						freePlacesTasks : DEFAULT_FREE_PLACES;
	}

	public int getCurrUnassigned() {
		return currUnassignedTask;
	}

	public void setCurrUnassignedTask(int currUnassignedTask) {
		AllWork.currUnassignedTask = 
				(currUnassignedTask >= MIN_FREE_PLACES && currUnassignedTask <= MAX_FREE_PLACES ) ? 
						currUnassignedTask : DEFAULT_CURR_TASK;
	}
	
	public Task[] getTasks() {
		return Arrays.copyOf(tasks, tasks.length);
	}

	public Employee[] getWorkers() {
		return Arrays.copyOf(workers, workers.length);
	}

	public void setWorkers(Employee[] workers) {
		this.workers = Arrays.copyOf(workers, workers.length);
	}
}
