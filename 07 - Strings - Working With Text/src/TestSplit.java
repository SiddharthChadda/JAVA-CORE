
public class TestSplit {

	public static void main(String[] args) {
		String s="The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.";
	    String sst[]=s.split("method");
	    for (String str : sst) {
			System.out.println(str);
		}
	}

}
