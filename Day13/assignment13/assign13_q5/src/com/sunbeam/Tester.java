package com.sunbeam;

import java.util.*;


public class Tester {

	public static void main(String[] args) {
		class BookPriceDescComparator implements Comparator<Book>{

			@Override
			public int compare(Book arg0, Book arg1) {
				int diff = Double.compare(arg0.getPrice(), arg1.getPrice());
				return -diff;
			}
			
		}
			NavigableSet<Book> set = new TreeSet<Book>(new BookPriceDescComparator());
			
			Collections.addAll(set, 
					new Book("1",500,"bhanu",2),
					new Book("1",1700,"bhanu",4),
					new Book("3",1600,"shubham",5),
					new Book("2",1800,"vivek",3));
			
			Iterator<Book> itr1 = set.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			System.out.println("=========================");
			Iterator<Book> itr2 = set.descendingIterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
//			barr.add(new Book("1",500,"Bhanu",2));
//			barr.add(new Book("1",500,"Bhanu",4));
			
//			for(Book e : set)
//				System.out.println(e);

	}

}
