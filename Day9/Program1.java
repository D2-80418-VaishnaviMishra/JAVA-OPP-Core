package Assignment;





public class Program1 {

	public static void main(String[] args) {
		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1 == s2);
//		
//		System.out.println(s1.equals(s2));
		
		/*
		 * StringBuffer s1 = new StringBuffer("Sunbeam"); String s2 = new
		 * String("Sunbeam"); System.out.println(s1 == s2);
		 * 
		 * System.out.println(s1.equals(s2));
		 */
		/*
		 * String s1 = new String("Sunbeam"); StringBuffer s2 = new
		 * StringBuffer("Sunbeam"); System.out.println(s1.equals(s2));
		 * System.out.println(s1.equals(s2.toString())); System.out.println(s1==s2);
		 */
		
//		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = s1.reverse();
//		System.out.println(s1 == s2);
//		
//		System.out.println(s1.equals(s2));
//		
//		
//		StringBuilder s1 = new StringBuilder("Sunbeam");
//		StringBuilder s2 = new StringBuilder("Sunbeam");
//		System.out.println(s1 == s2);
//		
//		System.out.println(s1.equals(s2));
//		
		
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length());
		
	}

}
