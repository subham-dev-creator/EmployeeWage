import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;

public class Company extends EmpWages implements EmpWageBuilder {
	
	//Variables
	int CompanyId;
	static int wagePerHour;
	static int TotalWorkingHourFullTime;
	static int TotalWorkHourPartTime;
	static int maxWorkDayPerMonth;
	static int maxWorkHour;
	int NumOfEmp;
	int Id=1;
	static ArrayList<EmpWages> emp = new ArrayList<EmpWages>();
	static ArrayList<Integer> DailyWages = new ArrayList<Integer>();
	
	//Constructor
	Company(int Num){
		this.CompanyId=Id++;
		wagePerHour = 20;
		TotalWorkingHourFullTime=8;
		TotalWorkHourPartTime=8;
		maxWorkDayPerMonth=20;
		maxWorkHour=100;
		this.NumOfEmp=Num;
	}
	
	 //Functions
	public int[] calculateWage(int TotalWorkHour,int TotalWorkDays,int CurObj) {
		
		int[] WageHourDaysArray=new int[3];
		int CurWage=0;
		int CurWorkHour = 0;
		EmpWages e=new EmpWages();
		
		while(TotalWorkHour<=maxWorkHour && TotalWorkDays<=maxWorkDayPerMonth) {
			int randomMark =(int)(Math.random()*10%3);
			if(randomMark!=0)
			{
			switch(randomMark) {
				case 1:
					//Full time
					TotalWorkHour+=TotalWorkingHourFullTime;
					CurWorkHour=TotalWorkingHourFullTime;
					break;
				case 2:
					//Part Time
					TotalWorkHour+=TotalWorkHourPartTime;
					CurWorkHour=TotalWorkHourPartTime;
					break;
				default:
					//No Work
					CurWorkHour=0;
					break;
				}
			}
			e.DailyWages.add(CurWorkHour*wagePerHour, TotalWorkDays);
			TotalWorkDays++;
		}
		
		emp.set(CurObj, e);
		CurWage=TotalWorkHour*TotalWorkDays*wagePerHour;
		WageHourDaysArray[0]=CurWage;
		WageHourDaysArray[1]=TotalWorkHour;
		WageHourDaysArray[2]=TotalWorkDays;
		return WageHourDaysArray;
	}
	
	int getTotalWage() {
		int TotalSalary=0;
		for(EmpWages e:emp) {
			TotalSalary+=e.MonthlyWage;
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
			
			c[i] = new Company(NumOfEmp[i]);
			for(int j=0;j<NumOfEmp[i];j++) {
				EmpWages e=new EmpWages();
				int[] WageHourDaysArray=new int[3];
				
				WageHourDaysArray=c[i].calculateWage(e.TotalWorkDays,e.TotalWorkHour,j);
				e.MonthlyWage=WageHourDaysArray[0];
				e.TotalWorkDays=WageHourDaysArray[1];
				e.TotalWorkHour=WageHourDaysArray[2];
				c[i].emp.add(e);
				
//				System.out.println("Company : " + i + " Employee " + j + " Has MonthlyWage " +e.MonthlyWage);
			}
		}
		for(int i=0;i<NumOfCompany;i++) {
			int CurCompanyWage=0;
			for(int j=0;j<NumOfEmp[i];j++) {
				for(int k=0;k<30;k++)
				CurCompanyWage+=c[i].emp.get(j).DailyWages.get(k);
			}
			DailyWages.set(i,CurCompanyWage);
		}
		
		for(int i=0;i<NumOfCompany;i++) {
			for(int j=0;j<30;j++)
			System.out.println("Company "+i+" Has Day " + j + " Wage is " + DailyWages.get(j) );
		}
		sc.close();
	}

	
}
