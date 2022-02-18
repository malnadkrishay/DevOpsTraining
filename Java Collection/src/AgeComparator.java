import java.util.Comparator;

/*The below given comparator compares employees on the basis of their age
 */
public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//parameter are of type Object, so we have to downcast it to Employee

		Employee e1 =(Employee)o1;
		Employee e2 =(Employee)o2;

		int emp1Age = e1.getAge();
		int emp2Age= e2.getAge();
		if(emp1Age>emp2Age)
			return 1;
		else
			if(emp1Age<emp2Age)
				return -1;
			else
				return 0;
	}


}
class NameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1 =(Employee)o1;
		Employee e2 =(Employee)o2;
     int result=e1.getName().compareTo(e2.getName());
     if(result!=0)
     {
       return result;
     }
     else
     {
		return 0;
     }
	}
	
}
