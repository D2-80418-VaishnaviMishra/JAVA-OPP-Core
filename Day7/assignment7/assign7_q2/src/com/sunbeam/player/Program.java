package com.sunbeam.player;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player[] team = new Player[3];
		for(int i=0; i<team.length; i++) {
			team[i] = new Cricketer();
			team[i].accept();
		}
		
		for(Player p:team)
			System.out.println(p.toString());
		
		
		int totalRuns = Players.batterTotalRuns(team);
		System.out.println("Total runs of all batters: " + totalRuns);
		
		int totalWickets = Players.bowlerTotalWickets(team);
        System.out.println("Total wickets of all bowlers: " + totalWickets);

        int numBatters = Players.countBatters(team);
        System.out.println("Number of batters: " + numBatters);

        int numBowlers = Players.countBowlers(team);
        System.out.println("Number of bowlers: " + numBowlers);

        Player maxRunBatter = Players.maxRunBatter(team);
        if (maxRunBatter != null) {
            System.out.println("Batter with maximum runs: " + maxRunBatter.getName());
        }

        Player maxWicketBowler = Players.maxWicketBowler(team);
	}

}
