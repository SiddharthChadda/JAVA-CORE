public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(st);
		String s = "Sachin Tendulkar";
		System.out.println(s.substring(6).trim());
		System.out.println(s.substring(0, 6));
		String str = "When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.";
	System.out.println(str.replaceAll("string", "int"));
	StringBuffer sb=new StringBuffer("naman");
	sb.append("katitar hfds fdyu");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	}

}
