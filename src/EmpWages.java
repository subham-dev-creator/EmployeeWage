public class EmpWages {
	int TotalWorkHour;
	int TotalWorkDays;
	int MonthlyWage;
	
	EmpWages(){
		MonthlyWage=0;
		TotalWorkHour=0;
		TotalWorkDays=0;
	}
	final static int wagePerHour = 20;
	final static int TotalWorkingHourFullTime=8;
	final static int TotalWorkHourPartTime=8;
	final static int maxWorkDayPerMonth=20;
	final static int maxWorkHour=100;
	
	void calculateWage() {
		int CurWage=0;
		while(TotalWorkHour<=maxWorkHour && TotalWorkDays<=maxWorkDayPerMonth) {
			int randomMark =(int)(Math.random()*10%3);
			if(randomMark!=0)
			{
			switch(randomMark) {
				case 1:
					//Full time
					TotalWorkHour+=TotalWorkingHourFullTime;
					break;
				case 2:
					//Part Time
					TotalWorkHour+=TotalWorkHourPartTime;
					break;
				default:
					//No Work
					break;
				}
			}
			TotalWorkDays++;
		}
		CurWage=TotalWorkHour*TotalWorkDays*wagePerHour;
		this.MonthlyWage= CurWage;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpWages emp=new EmpWages();
		emp.calculateWage();
		
		
		System.out.println("Total Work days : " + emp.TotalWorkDays + " Total Work Hour " + emp.TotalWorkHour + " Total Monthly Wage : " + emp.MonthlyWage);
	}

}
