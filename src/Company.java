import java.util.Scanner;
import java.util.Vector;

public class Company extends EmpWages {
	
	//Variables
	int CompanyId;
	static int wagePerHour;
	static int TotalWorkingHourFullTime;
	static int TotalWorkHourPartTime;
	static int maxWorkDayPerMonth;
	static int maxWorkHour;
	int Id=1;
	Vector<EmpWages> emp = new Vector<EmpWages>() ;
	
	//Constructor
	Company(){
		this.CompanyId=Id++;
		wagePerHour = 20;
		TotalWorkingHourFullTime=8;
		TotalWorkHourPartTime=8;
		maxWorkDayPerMonth=20;
		maxWorkHour=100;
	}
	
	static //Functions
	int[] calculateWage(int TotalWorkHour,int TotalWorkDays) {
		int[] WageHourDaysArray=new int[3];
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
		WageHourDaysArray[0]=CurWage;
		WageHourDaysArray[1]=TotalWorkHour;
		WageHourDaysArray[2]=TotalWorkDays;
		return WageHourDaysArray;
	}
	
	int getTotalWage() {
		int TotalSalary=0;
		for(int i=0;i<emp.size();i++) {
			TotalSalary+=emp.elementAt(i).MonthlyWage;
		}
		return TotalSalary;
	}
	
	public static void main(String[] args) {
		int NumOfCompany ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Count of Companies ");
		NumOfCompany = sc.nextInt();
		int[] NumOfEmp=new int[NumOfCompany];
		Company[] c =new Company[NumOfCompany];
		
		for(int i=0;i<NumOfCompany;i++) {
			System.out.println("Enter Count of Employees ");
			NumOfEmp[i]=sc.nextInt();
			
			c[i] = new Company();
			for(int j=0;j<NumOfEmp[i];j++) {
				EmpWages e=new EmpWages();
				int[] WageHourDaysArray=new int[3];
				
				WageHourDaysArray=calculateWage(e.TotalWorkDays,e.TotalWorkHour);
				e.MonthlyWage=WageHourDaysArray[0];
				e.TotalWorkDays=WageHourDaysArray[1];
				e.TotalWorkHour=WageHourDaysArray[2];
				c[i].emp.add(e);
				
//				System.out.println("Company : " + i + " Employee " + j + " Has MonthlyWage " +c[i].emp.elementAt(j).MonthlyWage);
			
			}
			
		}
		for(int i=0;i<NumOfCompany;i++)
		System.out.println("Company Total Wage " + c[i].getTotalWage());
		sc.close();
	}
}
