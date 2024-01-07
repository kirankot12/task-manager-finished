package taskmanagement;
import java.util.Scanner;
public class tasks {
	public String tasksinput;
	public void tasksmeph() {
		String tasks;
		Scanner taskin = new Scanner (System.in);
		
		do {System.out.println("Enter your task");
		
		this.tasksinput = taskin.nextLine();
		System.out.println(" Task saved - Your task is to " + tasksinput + ".");
		}while (!taskin.equals("0"));

			

			}
					
			

	}
	
	
	


