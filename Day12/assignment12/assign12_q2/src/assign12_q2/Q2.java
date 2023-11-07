package assign12_q2;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
		class StringLengthComparator implements Comparator<String>{

			@Override
			public int compare(String arg0, String arg1) {
				int diff = arg0.length() - arg0.length();
				return diff;
			}
			
		}
		
		List<String> sList = new ArrayList<>();
		sList.add("aaa");
		sList.add("zz");
//		sList.add("Wednesday");
//		sList.add("Thursday");
//		sList.add("cvbbhgfdcfvghg");
		String ans = Collections.max(sList,new StringLengthComparator());
		System.out.println(ans);

	}

}
