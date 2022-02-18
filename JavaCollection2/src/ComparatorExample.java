import java.util.Arrays;

public class ComparatorExample {

	public static void main(String[] args) {
		/*
		 * Employee array which will hole employees
		 */
		Employee employee[]=new Employee[2];
		//set different attributes of the individual employees
		
		employee[0]=new Employee();
		employee[0].setAge(40);
		employee[0].setName("Joe");
		
		employee[1]=new Employee();
		employee[1].setAge(20);
		employee[1].setName("Mark");
		System.out.println("Order of employee Before Sorting is");
		//print array is

	for(int i=0;i<employee.length;i++)
	{
		System.out.println("Employee"+(i+1)+"name::"+employee[i].getName());
		System.out.println("Employee"+(i+1)+"age::"+employee[i].getAge());
	}
	
	Arrays.sort(employee,new AgeComparator());
	System.out.println("Order Of Employee  after Sorting by employee age is");
	for(int i=0;i<employee.length;i++)
	{
		System.out.println("Employee"+(i+1)+"name::"+employee[i].getName());
		System.out.println("Employee"+(i+1)+"age::"+employee[i].getAge());
	}
	Arrays.sort(employee,new NameComparator());
	System.out.println("Order Of Employee  after Sorting by employee Name is");
	for(int i=0;i<employee.length;i++)
	{
		System.out.println("Employee"+(i+1)+"name::"+employee[i].getName());
		System.out.println("Employee"+(i+1)+"age::"+employee[i].getAge());
	}
	}
}
