
public class StringMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String s=" hello  ";
//	char c[]=	s.toCharArray();
//		for (char ch : c) {
//			System.out.println(ch);
//		}
		StringBuffer sf=new StringBuffer();
		sf.append("hello");
		System.out.println(sf.capacity());
		sf.append("javajjff vdvfkjvggf vb gfbhv gf hj edfsbfsbhfdkschfdks cvkdfjsvhds dfsvkdfsyvhkbcfds vdsfkjcvgdsf cdsvkuidscfds dscgdsks s");
		System.out.println(sf.capacity());
		sf.ensureCapacity(128);
		System.out.println(sf.capacity());
	}

}
