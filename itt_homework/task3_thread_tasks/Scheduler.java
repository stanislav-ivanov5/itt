package lesson24.task3;

import java.util.PriorityQueue;
import java.util.Queue;

/** 
* Scheduler class implements
* scheduling of the tasks
*/
public class Scheduler {

	private Queue<ITask> qu;
	
	public Scheduler(){
		
		qu = new PriorityQueue<ITask>();
	}
	
	private void push(ITask task){
		if(task != null){
			this.qu.add(task);
		}
	}
	
	private void start(){
		while(!this.qu.isEmpty()){
			this.qu.poll().doWork();
		}
	}
	
	public static void main(String[] args) {
		Scheduler sch = new Scheduler();
		int index = 0;
		while(index < 3){
			sch.push(new LaunchMissile());
			sch.push(new NavigateFlight());
			sch.push(new LoadFuel());
			sch.push(new LandOnMoon());
			sch.push(new MeetMartian());
			sch.start();			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			index++;
		}
	}
}
