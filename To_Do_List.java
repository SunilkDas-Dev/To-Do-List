
import java.util.Scanner;
import java.util.Vector;

public class To_Do_List 
{

	public static void main(String[] args)
	{
		Vector<String> todoList = new Vector<>();
		Scanner sc =new Scanner(System.in);
		
		int choice =0;
		do
		{
			System.out.println("To_Do_List Menu");
			System.out.println("1. Add Task");
			System.out.println("2. View Task");
			System.out.println("3. Mark Task As Completed ");
			System.out.println("4 . Exit");
			
			System.out.print("Enter Your choice :");
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1:
			{
				System.out.print("Sir . Enter The task Description :");
				String task = sc.nextLine();
				todoList.add(task);
				System.out.println("Task Added Successfully");
				
			}
			break;
			
			case 2 :
			{
				
				System.out.println("Sir Here Is Your To-Do-List  ");
			for(int i =0;i<todoList.size();i++)
			{
				System.out.println((i+1)+" ."+todoList.get(i));
				
			}
				
				
			}
			break;
			case 3:
			{
				System.out.print("Enter The Task Number That You Want To remove : ");
				int number = Integer.parseInt(sc.nextLine());
				
				if(number>1 && number<todoList.size())
				{
					String completeTask = todoList.remove((number-1));
					System.out.println("Task Marked As Completed :"+completeTask);
				}
				else
				{
					System.err.println("Invalid Input Sir .."
							+ "Try Again ");
				}
				
			}
			break;
			case 4:
			{
				System.out.println("Exiting TO-Do List");
			}
			break;
			default :
			{
				System.err.println("Invalid Input Sir Please Try again :");
			}
			
			
			}
		}
		while(choice!=4);
		sc.close();
		
	}

}
