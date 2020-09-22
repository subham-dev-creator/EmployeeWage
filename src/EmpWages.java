
public class EmpWages {
	
	final static int wagePerHour = 20;
	final static int TotalWorkingHour=8;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomMark =(int)(Math.random()*10%2);
		if(randomMark==1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		
		if(randomMark==1) {
			System.out.println("Total wage of Employee "+ TotalWorkingHour*wagePerHour);
		}
		else {
			System.out.println("N/A as Employee is Absent");
		}
	}

}
