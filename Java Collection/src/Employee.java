import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Employee implements Serializable {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void showDetails() 
	{
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Salary"+salary);

	}

	

}
class EmployeeObjectSerializationDemo
{
	void writeData()
	{
		Employee db[]= {new Employee("ABC",22,12000.00),
				new Employee("DEF",23,24000.00),new Employee("GHI",24,36000.00)};
		try(FileOutputStream fos=new FileOutputStream("emp-obj.dat");ObjectOutputStream oos=new ObjectOutputStream(fos);)
		{
			for(int i=0;i<db.length;i++)
			{
				oos.writeObject(db[i]);	
			}
		}catch(Exception e)
		{

		}
	}
	void readData()
	{
		try(FileInputStream fis=new FileInputStream("emp-obj.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);)
		{
			Employee e= (Employee)ois.readObject();
			e.showDetails();
			e= (Employee)ois.readObject();
			e.showDetails();
			e= (Employee)ois.readObject();
			e.showDetails();
		}catch(Exception e)
		{

		}	
	}
	public static void main(String[] args) {
		EmployeeObjectSerializationDemo impl=new EmployeeObjectSerializationDemo();
		impl.writeData();
		impl.readData();
	}
}