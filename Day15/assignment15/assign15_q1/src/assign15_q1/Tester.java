package assign15_q1;

import java.util.*;

public class Tester {
	
	public static Candidate accept(Scanner sc) {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(0, name, party, votes);	
		return c;
	}
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("====================================");
		System.out.println("1. Insert new candidate");
		System.out.println("2. Display all candidates");
		System.out.println("3. Delete candidate with given id");
		System.out.println("4. Find candidate of given id");
		System.out.println("5. Find candidates of given party");		
		System.out.println("6. Display total votes for each party");
		System.out.println("====================================");
		System.out.print("Enter you choice : ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice=menu(sc))!=0) {
			switch (choice) {
				case 1:
					try(CandidateDao cd = new CandidateDao()){
						Candidate c = accept(sc);
						int count = cd.save(c);
						System.out.println("Rows Affected : "+count);
					} 	catch(Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try(CandidateDao cd = new CandidateDao()) {
						List<Candidate> list = cd.findAll();
						for (Candidate c:list) {
							System.out.println(c);
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try(CandidateDao cd = new CandidateDao()) {
						System.out.println("Enter the id : ");
						int id = sc.nextInt();
						int count = cd.deleteById(id);
						System.out.println("Rows Affected : "+count);
					}catch(Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try(CandidateDao cd = new CandidateDao()) {
						System.out.println("Enter the id : ");
						int id = sc.nextInt();
						Candidate c = cd.findById(id);
						System.out.println(c);
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					break;
				case 5:
					try(CandidateDao cd = new CandidateDao()) {
						System.out.println("Enter the name of party : ");
						String party = sc.next();
						List<Candidate> list = cd.findByParty(party);
						for (Candidate c:list) {
							System.out.println(c);
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					break;
				case 6:
					try(CandidateDao cd = new CandidateDao()) {
						List<PartyVotes> list = cd.getPartywiseVotes();
						for (PartyVotes c:list) {
							System.out.println(c);
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("Enter the correct choice...........");
					break;
		}
		

	}
	}
}
