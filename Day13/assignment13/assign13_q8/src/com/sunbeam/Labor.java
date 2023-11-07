package com.sunbeam;

public class Labor implements Emp {
	private int hours;
	private double rate;
	
	public Labor(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hours*rate;
	}
	
	@Override
	public double calcIncentives() {
		if (hours>300) {
			return 0.05*rate*hours;
		}
		return 0;
	}
	
}
