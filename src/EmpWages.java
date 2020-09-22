
public class EmpWages {
	
	final static int wagePerHour = 20;
	final static int TotalWorkingHourFullTime=8;
	final static int TotalWorkHourPartTime=8;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomMark =(int)(Math.random()*10%3);
		
		if(randomMark==1) {
			//Full Time
			System.out.println("Total wage Full Time : "+ TotalWorkingHourFullTime*wagePerHour);
		}
		else if(randomMark==2){
			//Part Time
			System.out.println("Total wage Part Time : "+TotalWorkingHourFullTime*wagePerHour);
		}
		else {
			//Not Present
			System.out.println("N/A Not an Employee");
		}
	}

}
