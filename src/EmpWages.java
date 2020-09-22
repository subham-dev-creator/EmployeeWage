
public class EmpWages {
	
	final static int wagePerHour = 20;
	final static int TotalWorkingHourFullTime=8;
	final static int TotalWorkHourPartTime=8;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomMark =(int)(Math.random()*10%3);
		
		switch(randomMark) {
		case 1:
			System.out.println("Total wage Full Time : "+ TotalWorkingHourFullTime*wagePerHour);
			break;
		case 2:
			System.out.println("Total wage Full Time : "+ TotalWorkingHourFullTime*wagePerHour);
			break;
		default:
			System.out.println("N/A Not an Employee");
		}
	}

}
