import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class App {
 
    public static void main(String[] args) throws Exception {
    	List<Employee> empList = new ArrayList<>();
    	ArrayList<Employee> empt = new ArrayList<>();
    	empt.trimToSize();
    	System.out.println(empt.size());
        Set<Employee> Employeesss = new HashSet<Employee>();
        for(int i=0; i<10 ; i++){
        	Employee e = new Employee();
        	e.setId(i);
        	e.setName("XXX");
        	e.setLocation("Delhi");
        	Employeesss.add(e);
        }
       
        empt.addAll(Employeesss);
     System.out.println(Employee.getCapacity(empt));
        System.out.println(Employeesss.size());
        Employee e = new Employee();
    	e.setId(2);
    	e.setName("XXX");
    	e.setLocation("Delhi");
    	Employeesss.add(e);
    	empt.addAll(Employeesss);
    	empt.trimToSize();
    	System.out.println("dfghjk"+empt.size());
        System.out.println("-------------------------"+Employee.getCapacity(empt));
    	
    	e = new Employee();
    	e.setId(4);
    	e.setName("YYYY");
    	e.setLocation("Delhi");
    	Employeesss.add(e);
        empList.addAll(Employeesss);
        Employee[] emp = empList.toArray(new Employee[empList.size()]);
        for(int i=0; i<emp.length ; i++){
        	System.out.println(emp[i].getId()+"&&&&&&&&&&&&"+emp[i].getName()+"&&&&&&&&&&&&&&&"+emp[i].getLocation());
        }
        empList = Arrays.asList(emp);
        Collections.sort(empList);
        for(Employee eee : empList){
            System.out.println("My name is "+eee.getName());
           }
        System.out.println(Employeesss.size());
    }
}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public int compareTo(Employee arg0) {
		Employee e = (Employee)arg0;
	    return this.name.compareTo(e.getName());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}