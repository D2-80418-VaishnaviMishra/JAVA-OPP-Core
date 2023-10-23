



 class Date {
	int Day;
	int Month;
	int Year;
	
public Date() {
	this.Day = 1;
	this.Month = 1;
	this.Year = 1900;
		
	}
	
	public Date(int day, int month, int year) {
		
		Day = day;
		Month = month;
		Year = year;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}	
	
	public void displayDate() {
		System.out.println("The entered date is "+this.Day+"/"+this.Month+"/"+this.Year);
	}
}




public class Prog {

	public static void main(String[] args) {
		Date d1 = new Date(5,5,2000);
		d1.displayDate();
		d1.setDay(10);
		d1.displayDate();
		d1.setYear(2023);
		d1.displayDate();
		
		

	}

}
