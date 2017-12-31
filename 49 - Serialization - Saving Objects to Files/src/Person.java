import java.io.Serializable;
 
public class Person implements Serializable {
	private static final long serialVersionUID = 5675672L;
	private  transient  int id;
    private String name;
     
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
    
}
 
//public void writeObject(ObjectOutputStream os) throws IOException {
//	os.defaultWriteObject();
//	Person mike = new Person(543, "Mike");
//	os.writeObject(mike);
//	
//}
//private void readObject(ObjectInputStream ois)
//		throws ClassNotFoundException, IOException {
//		    
//		    ois.defaultReadObject();
//		   
//
//		}