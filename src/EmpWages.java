import java.util.Vector;

public class EmpWages {
	int TotalWorkHour;
	int TotalWorkDays;
	int MonthlyWage;
	final int MaxWorkDays=30;
	Vector<Integer> DailyWages=new Vector<Integer>();
	EmpWages(){
		MonthlyWage=0;
		TotalWorkHour=0;
		TotalWorkDays=0;
		for(int i=0;i<MaxWorkDays;i++)
			DailyWages.add(0,i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpWages emp=new EmpWages();
		EmpWages e=new EmpWages();
		
		
		System.out.println("Total Work days : " + emp.TotalWorkDays + " Total Work Hour " + emp.TotalWorkHour + " Total Monthly Wage : " + emp.MonthlyWage);

		System.out.println("Total Work days : " + e.TotalWorkDays + " Total Work Hour " + e.TotalWorkHour + " Total Monthly Wage : " + e.MonthlyWage);
	}

}
