package com.sunbeam.player;

public class Players {
	public static int batterTotalRuns(Player[] arr) {
		int runs = 0;
		for(Player p:arr) {
			if(p instanceof Batter) {
				Batter b = (Batter)p;
				runs = runs + b.getRuns();
			}
		}
		return runs;
	}
	public static int bowlerTotalWickets(Player[] arr) {
		int wickets = 0;
		for(Player p:arr) {
			if (p instanceof Bowler) {
				Bowler b = (Bowler)p;
				wickets += b.getWickets();
			}
		}
		return wickets;
	}
	public static int countBatters(Player[] arr) {
		int count = 0;
        for (Player p : arr) {
            if (p instanceof Batter) {
                count++;
            }
        }
        return count;
	}
	public static int countBowlers(Player[] arr) {
		int count = 0;
        for (Player p : arr) {
            if (p instanceof Bowler) {
                count++;
            }
        }
        return count;
	}
	public static Player maxRunBatter(Player[] arr) {
		Player maxBatter = null;
        int maxRuns = -1;

        for (Player p : arr) {
            if (p instanceof Batter) {
                int runs = ((Batter) p).getRuns();
                if (runs > maxRuns) {
                    maxRuns = runs;
                    maxBatter = p;
                }
            }
        }

        return maxBatter;
	}
	public static Player maxWicketBowler(Player[] arr) {
		Player maxBowler = null;
        int maxWickets = -1;

        for (Player p : arr) {
            if (p instanceof Bowler) {
                int wickets = ((Bowler) p).getWickets();
                if (wickets > maxWickets) {
                    maxWickets = wickets;
                    maxBowler = p;
                }
            }
        }

        return maxBowler;
	}
}
