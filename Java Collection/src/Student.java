import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
	private String name;
	private long id=0;
	private double gpa=0.0;
	public Student(String name, long id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public double getGpa() {
		return gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}
	@Override
	public int compareTo(Student o) {
		int result=this.getName().compareTo(o.getName());
		if(result>0)
		{
			return 1;

		}
		else if(result<0)
		{
			return -1; 
		}
		{
			return 0;
		}
	}


}
class TestComparable
{
	public static void main(String[] args) {
		Set<Student>  studentList=new TreeSet<Student>();
		
		studentList.add(new Student("Matias",1111,7.9));
		studentList.add(new Student("Shaquiel",2222,8));
		studentList.add(new Student("Luke",3333,9));
		for(Student student:studentList)
		{
			System.out.println(student);
		}
	}
}


