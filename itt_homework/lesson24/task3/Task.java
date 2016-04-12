package lesson24.task3;

public abstract class Task implements ITask, Comparable<Task> {
	// provide measure to compare Tasks with one another
	// needed for using PriorityQueue
	private int index; 
	
	@Override
	public abstract void doWork();

	@Override
	public int compareTo(Task task) {
		return this.getIndex() - task.getIndex();
	}
	
	public int getIndex(){
		return this.index;
	}
}
