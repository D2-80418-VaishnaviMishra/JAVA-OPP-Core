package com.sunbeam.player;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler{
	private int runs;
	private int wickets;
	private double average;
    private double strikeRate;
    private double economy;
	
    public Cricketer() {
		// TODO Auto-generated constructor stub
	}
    
    public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets, double average, double strikeRate, double economy) {
        super(id, name, age, matchesPlayed);
        this.runs = runs;
        this.wickets = wickets;
        this.average = average;
        this.strikeRate = strikeRate;
        this.economy = economy;
    }

	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return wickets;
	}
	@Override
	public double getEconomy() {
		// TODO Auto-generated method stub
		return economy;
	}
	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}
	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return average;
	}
	@Override
	public double getStrikeRate() {
		// TODO Auto-generated method stub
		return strikeRate;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Cricketer [runs=" + runs + ", wickets=" + wickets + ", average=" + average + ", strikeRate="
				+ strikeRate + ", economy=" + economy + "]";
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the Cricketer");
		System.out.print("Enter the Id : ");
		super.setId(sc.nextInt());
		System.out.print("Enter the name : ");
		super.setName(sc.next());
		System.out.print("Enter the age : ");
		super.setAge(sc.nextInt());
		System.out.print("Enter the number of matches played :");
		super.setMatchesPlayed(sc.nextInt());
		System.out.print("Enter the runs scored :");
		this.runs = sc.nextInt();
		System.out.print("Enter the wickets taken :");
		this.wickets = sc.nextInt();
		System.out.print("Enter the average :");
		this.average = sc.nextDouble();
		System.out.print("Enter the strike rate :");
		this.strikeRate = sc.nextDouble();
		System.out.print("Enter the economy :");
		this.economy = sc.nextDouble();
		
		
	};
	
}
