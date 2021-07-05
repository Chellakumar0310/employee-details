import java.util.Scanner;

public class employee {
	String name,address;
	int yearofjoining;
	
	public void getInput(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Employee Name:  ");
		name = in.next();
		System.out.println("Enter the Year of Joining: ");
		yearofjoining =  in.nextInt();
		System.out.println("Enter the Address: ");
		address = in.next();
		
	}
	public void display(){
		System.out.println("Employee Name = "+name);
		System.out.println("Year of Joining = "+yearofjoining);
		System.out.println("Address = "+address);
		
		
	}
	

	public static void main(String[] args) {
		employee e[] = new employee[5];
		for(int i = 0;i<3;i++)
		{
			e[i] = new employee();
		e[i].getInput();
		}
		System.out.println("****Data entered****");
		
		for(int i=0;i<3;i++)
		{
			e[i].display();
			
		}
		
		
		
	}
}


