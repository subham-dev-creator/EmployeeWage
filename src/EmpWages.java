
public class EmpWages {
	
	final static int wagePerHour = 20;
	final static int TotalWorkingHourFullTime=8;
	final static int TotalWorkHourPartTime=8;
	final static int maxWorkDayPerMonth=20;
	final static int maxWorkHour=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TotalWorkHour=0;
		int TotalWorkDays=0;
		
		while(TotalWorkHour<=maxWorkHour && TotalWorkDays<=maxWorkDayPerMonth) {
			int randomMark =(int)(Math.random()*10%3);
			if(randomMark!=0)
			{
			switch(randomMark) {
				case 1:
					TotalWorkHour+=TotalWorkingHourFullTime;
					break;
				case 2:
					TotalWorkHour+=TotalWorkHourPartTime;
					break;
				default:
					break;
				}
			}
			TotalWorkDays++;
		
		}
		
		System.out.println("Total Work days : " + TotalWorkDays + " Total Work Hour " + TotalWorkHour + "Total Monthly Wage : " + TotalWorkHour*TotalWorkDays*wagePerHour);
	}

}
