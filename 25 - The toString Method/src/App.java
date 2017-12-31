class Frog {
     
    private int id;
    private String name;
     
    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

	@Override
	public String toString() {
		return "Frog [id=" + id + ", name=" + name + "]";
	}

}
 
public class App {
 
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");
         
      System.out.println(frog1.toString());
        
        System.out.println(frog1);
    }
}